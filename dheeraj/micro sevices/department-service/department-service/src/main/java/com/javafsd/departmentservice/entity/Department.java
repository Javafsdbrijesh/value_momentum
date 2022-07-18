package com.javafsd.departmentservice.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity

@Table(name="department")
public class Department {
    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="department_generator")
    @SequenceGenerator(name="department_generator",sequenceName ="department_seq",allocationSize=50)
    @Column(name="department_id",updatable= false,nullable = false)

    private long departmentId;

    @NotBlank(message="Please Add Department Name")
    @Column(name="department_name")
    private String departmentName;

    @Column(name="department_address")
    private String departmentAddress;

    @Column(name="department_code")
    private String departmentCode;


    public Department() {

    }
    public Department(long departmentId, @NotBlank(message = "Please Add Department Name") String departmentName,
            String departmentAddress, String departmentCode) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
                + ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
    }
    public long getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentAddress() {
        return departmentAddress;
    }
    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }
    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

}