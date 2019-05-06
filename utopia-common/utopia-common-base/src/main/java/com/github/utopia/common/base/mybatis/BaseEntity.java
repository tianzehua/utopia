package com.github.utopia.common.base.mybatis;

import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * The class Base domain.
 *
 * @author tianzehua
 */
@Data
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 2393269568666085258L;
	/**
	 * 版本号
	 */
	@Transient
	private Integer version;
	/**
	 * 创建人
	 */
	@Transient
	private String creator;

	/**
	 * 创建人ID
	 */
	@Transient
	private Long creatorId;

	/**
	 * 最近操作人
	 */
	@Transient
	private String lastOperator;

	/**
	 * 最后操作人ID
	 */
	@Transient
	private Long lastOperatorId;


	@Transient
	private Integer pageNum;

	@Transient
	private Integer pageSize;

	@Transient
	private String orderBy;

	//地区
	@Transient
	private Integer[] region;


}
