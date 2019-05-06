package com.github.utopia.common.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @auther: tianzehua
 * @date: 2018/8/15 15:23
 */
@Data
public class LoginAuthDto implements Serializable {
	private static final long serialVersionUID = -1137852221455042256L;
	private Long userId;
	private String loginName;
	private String userName;
	private Long deptId;
	private String deptName;


	public LoginAuthDto() {
	}

	public LoginAuthDto(Long userId, String loginName, String userName) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
	}

	public LoginAuthDto(Long userId, String loginName, String userName, Long deptId, String deptName) {
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
		this.deptId = deptId;
		this.deptName = deptName;
	}
}
