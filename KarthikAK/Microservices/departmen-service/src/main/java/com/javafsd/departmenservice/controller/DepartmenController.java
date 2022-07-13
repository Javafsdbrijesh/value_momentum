package com.javafsd.departmenservice.controller;

import java.util.List;	

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.departmenservice.entity.Departmen;
import com.javafsd.departmenservice.error.DepartmenNotFoundException;
import com.javafsd.departmenservice.service.impl.DepartmenService;

@RestController
@RequestMapping("/departmens")
public class DepartmenController 
{
    @Autowired
    private DepartmenService departmenService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmenController.class);

    @PostMapping("/")
    public Departmen saveDepartmen( @RequestBody Departmen departmen) {
        Departmen departmenResponse = departmenService.saveDepartmen(departmen);
        return departmenResponse;
    }

    @GetMapping("/")
    public List<Departmen> findDepartmens(){
        LOGGER.debug("Inside findDepartmens method");
        LOGGER.info("Inside findDepartmens method");
        List<Departmen> departmenList = departmenService.getDepartmens();
        return departmenList;
    }

    @GetMapping("/{id}")
    public Departmen fetchDepartmenById(@PathVariable("id") Long departmenId) throws DepartmenNotFoundException{
        LOGGER.info("Inside fetchDepartmenById method");
        Departmen departmen = departmenService.getDepartmenById(departmenId);        
        LOGGER.info("Inside fetchDepartmenById method, Response : " + departmen);
        return departmen;
    }

    @GetMapping("/name/{name}")
    public Departmen fetchDepartmenByName(@PathVariable("name") String departmenName) {
        Departmen departmen = departmenService.getDepartmenByName(departmenName);
        return departmen;
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmenById(@PathVariable("id") Long departmenId) {
        departmenService.deleteDepartmenById(departmenId);
        return "Departmen deleted successfully for Departmen Id" + departmenId;
    }

    @PutMapping("/{id}")
    public Departmen updateDepartmen(@PathVariable("id") Long departmenId,
            @RequestBody Departmen departmen) {
        Departmen departmenRes = departmenService.updateDepartmen(departmen, departmenId);
        return departmenRes;

    }
}