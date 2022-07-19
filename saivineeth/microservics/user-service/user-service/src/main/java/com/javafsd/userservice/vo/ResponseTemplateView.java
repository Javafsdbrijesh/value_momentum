package com.javafsd.userservice.vo;

import com.javafsd.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateView {
	private User user;
	private DepartmentView departmentView;

}