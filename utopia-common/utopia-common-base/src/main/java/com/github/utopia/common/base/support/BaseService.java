

package com.github.utopia.common.base.support;


import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * The class Base service.
 *
 * @param <T> the type parameter
 *
 * @author tianzehua
 */
@Service
public  class BaseService<T> implements IService<T> {

    @Autowired
    protected Mapper<T> mapper;

    @Override
    public List<T> select(T record) {
        return mapper.select(record);
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public int selectCount(T record) {
        return mapper.selectCount(record);
    }

    @Override
    public int save(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int batchSave(List<T> list) {
        return 0;
    }

    @Override
    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(T record) {
        return delete(record);
    }

    @Override
    public int batchDelete(List<T> list) {
        return 0;
    }

    @Override
    public int deleteByKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return 0;
    }

    @Override
    public int updateByExample(T record, Object example) {
        return 0;
    }

    @Override
    public int deleteByExample(Object example) {
        return 0;
    }

    @Override
    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return null;
    }
}
