package com.github.utopia.common.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * The class Check valid domain.
 *
 * @author tianzehua
 */
@Data
public class CheckValidDto implements Serializable {
	private static final long serialVersionUID = 5178470476151416779L;
	/**
	 * 校验的参数值
	 */
	private String validValue;

	/**
	 * 参数类型(列)
	 */
	private String type;
}
