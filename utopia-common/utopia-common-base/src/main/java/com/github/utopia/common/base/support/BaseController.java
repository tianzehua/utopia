

package com.github.utopia.common.base.support;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.github.utopia.common.base.mybatis.BaseEntity;
import com.github.utopia.common.base.utils.PublicUtil;
import com.github.utopia.common.base.wrapper.WrapMapper;
import com.github.utopia.common.base.wrapper.Wrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * The class Base web.
 *
 * @author tianzehua
 */
public class BaseController<Service extends IService<Entity>,Entity extends BaseEntity> {

	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected Service baseService;

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());



	/**
	 * Handle result wrapper.
	 *
	 * @param <T>    the type parameter
	 * @param result the result
	 *
	 * @return the wrapper
	 */
	protected <T> Wrapper<T>  handleResult(T result) {
		boolean flag = isFlag(result);

		if (flag) {
			return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "操作成功", result);
		} else {
			return WrapMapper.wrap(Wrapper.ERROR_CODE, "操作失败", result);
		}
	}

	/**
	 * Handle result wrapper.
	 *
	 * @param <E>      the type parameter
	 * @param result   the result
	 * @param errorMsg the error msg
	 *
	 * @return the wrapper
	 */
	protected <E> Wrapper<E> handleResult(E result, String errorMsg) {
		boolean flag = isFlag(result);

		if (flag) {
			return WrapMapper.wrap(Wrapper.SUCCESS_CODE, "操作成功", result);
		} else {
			return WrapMapper.wrap(Wrapper.ERROR_CODE, errorMsg, result);
		}
	}

	private boolean isFlag(Object result) {
		boolean flag;
		if (result instanceof Integer) {
			flag = (Integer) result > 0;
		} else if (result instanceof Boolean) {
			flag = (Boolean) result;
		} else {
			flag = PublicUtil.isNotEmpty(result);
		}
		return flag;
	}


	@RequestMapping(value = "/add",method = RequestMethod.POST)
	@ResponseBody
	public Wrapper<Integer> add(Entity entity){
		int result = baseService.save(entity);
		return handleResult(result);
	}

	@RequestMapping(value = "/get/{id}",method = RequestMethod.POST)
	@ResponseBody
	public Wrapper get(@PathVariable long id){
		Entity list = (Entity) baseService.selectByKey(id);
		return WrapMapper.ok(list);
	}

	@RequestMapping(value = "/update",method = RequestMethod.POST)
	@ResponseBody
	public Wrapper update( Entity entity){
		int result = baseService.update(entity);
		return  handleResult(result);
	}
	@RequestMapping(value = "/remove/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public Wrapper remove(@PathVariable long id){
		int result = baseService.deleteByKey(id);
		return handleResult(result);
	}

	@RequestMapping(value = "/all",method = RequestMethod.POST)
	@ResponseBody
	public Wrapper all(){
		return WrapMapper.ok(baseService.selectAll());
	}


	@RequestMapping(value = "/page",method = RequestMethod.POST)
	@ResponseBody
	public Wrapper list(Entity entity){
		//查询列表数据
		if (entity.getPageNum() == 0 || entity.getPageNum() == null){
			entity.setPageNum(1);
		}
		if (entity.getPageSize() == 0 || entity.getPageSize() == null){
			entity.setPageSize(10);
		}

		PageHelper.startPage(entity.getPageNum(), entity.getPageSize());
		List<Entity> sList = baseService.select(entity);
		return WrapMapper.ok(new PageInfo<>(sList));
	}


}
  