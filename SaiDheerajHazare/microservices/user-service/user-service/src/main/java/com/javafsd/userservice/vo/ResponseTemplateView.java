package com.javafsd.userservice.vo;

import com.javafsd.userservice.entity.User;

public class ResponseTemplateView {
	private User user;
	private DepartmentView departmentView;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DepartmentView getDepartmentView() {
		return departmentView;
	}
	public void setDepartmentView(DepartmentView departmentView) {
		this.departmentView = departmentView;
	}
	public ResponseTemplateView(User user, DepartmentView departmentView) {
		super();
		this.user = user;
		this.departmentView = departmentView;
	}
	public ResponseTemplateView() {
		
	}
	@Override
	public String toString() {
		return "ResponseTemplateView [user=" + user + ", departmentView=" + departmentView + "]";
	}

}
