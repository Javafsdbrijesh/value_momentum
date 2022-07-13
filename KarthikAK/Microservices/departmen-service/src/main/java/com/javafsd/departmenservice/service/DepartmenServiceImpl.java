package com.javafsd.departmenservice.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafsd.departmenservice.entity.Departmen;
import com.javafsd.departmenservice.error.DepartmenNotFoundException;
import com.javafsd.departmenservice.repository.DepartmenRepository;
import com.javafsd.departmenservice.service.impl.DepartmenService;

@Service
public class DepartmenServiceImpl implements DepartmenService
{
    @Autowired 
    private DepartmenRepository departmenRepository;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmenServiceImpl.class);

    @Override
    public Departmen saveDepartmen(Departmen departmen) {
        Departmen departmenResponse = departmenRepository.save(departmen);
        LOGGER.info("Departmen saved successfully in database");
        return departmenResponse; 
    }

    @Override
    public List<Departmen> getDepartmens() {
        List<Departmen> departmenList = departmenRepository.findAll();
        return departmenList;
    }

    @Override
    public Departmen getDepartmenById(Long departmenId) throws DepartmenNotFoundException {
        Optional<Departmen> departmen = departmenRepository.findById(departmenId);
        if(!departmen.isPresent()) {
            throw new DepartmenNotFoundException("Departmen not Available for Departmen Id: " + departmenId);
        }
        return departmen.get();
    }

    @Override
    public Departmen getDepartmenByName(String name) {
        Departmen departmen = departmenRepository.findByDepartmenName(name);
        return departmen;
    }

    @Override
    public void deleteDepartmenById(Long departmenId) {
        departmenRepository.deleteById(departmenId);
    }

    @Override
    public Departmen updateDepartmen(Departmen departmenReq, Long departmenId) {
        Departmen departmenDB = departmenRepository.findById(departmenId).get();

        if(Objects.nonNull(departmenReq.getDepartmenName()) && 
                !"".equalsIgnoreCase(departmenReq.getDepartmenName())){
            departmenDB.setDepartmenName(departmenReq.getDepartmenName());
            LOGGER.info("Departmen Name updates successfully");
        }
        if(Objects.nonNull(departmenReq.getDepartmenAddress()) && 
                !"".equalsIgnoreCase(departmenReq.getDepartmenAddress())) {
            departmenDB.setDepartmenAddress(departmenReq.getDepartmenAddress());
            LOGGER.info("Departmen Address updates successfully");
        }
        if(Objects.nonNull(departmenReq.getDepartmenCode()) && 
                !"".equalsIgnoreCase(departmenReq.getDepartmenCode())) {
            departmenDB.setDepartmenCode(departmenReq.getDepartmenCode());
            LOGGER.info("Departmen  Code updated successfully");
        }

        Departmen dept = departmenRepository.save(departmenDB);

        return dept;
    }
}
