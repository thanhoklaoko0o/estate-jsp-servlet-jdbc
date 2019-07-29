package com.laptrinhweb.entity;

import com.laptrinhweb.annotation.Column;
import com.laptrinhweb.annotation.Entity;

@Entity
public class UserRole extends BaseEntity{
	@Column(name="userid")
	private Long userId;
	
	@Column(name="roleid")
	private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
}
