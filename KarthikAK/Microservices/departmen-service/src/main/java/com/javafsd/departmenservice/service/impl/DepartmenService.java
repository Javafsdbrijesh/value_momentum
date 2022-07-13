package com.javafsd.departmenservice.service.impl;

import java.util.List;

import com.javafsd.departmenservice.entity.Departmen;
import com.javafsd.departmenservice.error.DepartmenNotFoundException;

public interface DepartmenService 
{
    public Departmen saveDepartmen(Departmen departmen);
    public List<Departmen> getDepartmens();
    public Departmen getDepartmenById(Long departmenId) throws DepartmenNotFoundException;
    public Departmen getDepartmenByName(String name);
    public void deleteDepartmenById(Long departmenId);
    public Departmen updateDepartmen(Departmen departmen, Long departmenId);
}