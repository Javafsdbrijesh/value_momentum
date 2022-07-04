package com.javafsd.deptservice.service.impl;

import java.util.List;
import com.javafsd.deptservice.entity.Dept;

public interface DeptService 
{
	public Dept saveDept(Dept dept);
	public List<Dept> getDepts();
	public Dept getDeptById(Long deptId);
	public Dept getDeptByName(String name);
	public void deleteDeptById(Long deptId);
}
