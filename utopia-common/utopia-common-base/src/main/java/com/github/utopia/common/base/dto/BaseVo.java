package com.github.utopia.common.base.dto;

import lombok.Data;

import java.io.Serializable;


/**
 * The class Base vo.
 *
 * @author tianzehua
 */
@Data
public class BaseVo implements Serializable {
	private static final long serialVersionUID = -1695850022460957581L;


	private Integer pageNum;


	private Integer pageSize;


	private String orderBy;
}
