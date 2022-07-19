package com.javafsd.UserService.service;

import com.javafsd.UserService.Vo.DepartmentView;
import com.javafsd.UserService.entity.User;

public interface ResponseTemplateView {

	void setDepartmentView(DepartmentView departmentView);

	void setUser(User userRespFromDB);

}
