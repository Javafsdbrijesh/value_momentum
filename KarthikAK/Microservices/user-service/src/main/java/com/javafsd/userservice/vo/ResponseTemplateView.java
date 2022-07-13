package com.javafsd.userservice.vo;

import com.javafsd.userservice.entity.User;

public class ResponseTemplateView 
{
	private User user;
    private DepartmenView departmenView;
    
	public ResponseTemplateView() 
	{
		super();
	}

	public ResponseTemplateView(User user, DepartmenView departmenView) {
		super();
		this.user = user;
		this.departmenView = departmenView;
	}

	@Override
	public String toString() {
		return "ResponseTemplateView [user=" + user + ", departmenView=" + departmenView + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DepartmenView getDepartmenView() {
		return departmenView;
	}

	public void setDepartmenView(DepartmenView departmenView) {
		this.departmenView = departmenView;
	}
    
    
}
