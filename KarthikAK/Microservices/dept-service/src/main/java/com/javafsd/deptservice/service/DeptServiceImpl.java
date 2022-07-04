package com.javafsd.deptservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javafsd.deptservice.entity.Dept;
import com.javafsd.deptservice.repository.DeptRepository;
import com.javafsd.deptservice.service.impl.DeptService;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptRepository deptRepository;
	
	@Override
	public Dept saveDept(Dept dept)
	{
		Dept deptresponse = deptRepository.save(dept);
		return deptresponse;
	}
	
	@Override
	public List<Dept> getDepts()
	{
		List<Dept> deptList = deptRepository.findAll();
		return deptList;
	}
	
	@Override
	public Dept getDeptById(Long deptId)
	{
		Optional<Dept> dept = deptRepository.findById(deptId);
		return dept.get();
	}
	
	@Override
	public Dept getDeptByName(String name)
	{
		Dept dept = deptRepository.findBydeptName(name);
		return dept;
	}
	
	@Override
	public void deleteDeptById(Long deptId)
	{
		deptRepository.deleteById(deptId);
	}
}
