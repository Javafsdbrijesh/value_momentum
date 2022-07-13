package com.javafsd.departmentservice.service;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
 
import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.repository.DepartmentRepository;
import com.javafsd.departmentservice.service.impl.DepartmentService;
 
@SpringBootTest
class DepartmentServiceImplTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;
 
    @BeforeEach
    void setup() {
        Department department = new Department();
        department.setDepartmentName("HR");
        department.setDepartmentAddress("Pune");
        department.setDepartmentCode("HR001");
        department.setDepartmentId(1L);

        Mockito.when(departmentRepository.findByDepartmentName("HR")).thenReturn(department);

    }

    @Test
    @DisplayName("Get Department data based on Valid Department Name")
    public void whenvalidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "HR";
        Department departmentResponse = departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName, departmentResponse.getDepartmentName());
    }
}