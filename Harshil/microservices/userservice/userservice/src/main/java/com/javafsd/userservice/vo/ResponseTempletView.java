package com.javafsd.userservice.vo;

import com.javafsd.userservice.entity.User;

public class ResponseTempletView {
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
		public ResponseTempletView(User user, DepartmentView departmentView) {
			super();
			this.user = user;
			this.departmentView = departmentView;
		}
		public ResponseTempletView() {
		}
		@Override
		public String toString() {
			return "ResponseTempletView [user=" + user + ", departmentView=" + departmentView + "]";
		}
}
	  
