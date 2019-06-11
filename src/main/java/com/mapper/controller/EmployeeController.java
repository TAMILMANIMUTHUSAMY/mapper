package com.mapper.controller;

import com.mapper.domain.Employee;
import com.mapper.domain.Sex;
import com.mapper.dto.EmployeeDTO;
import com.mapper.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 11-06-2019 23:27
 */

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("domainToDTO")
    public EmployeeDTO getEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Tamilmani");
        employee.setLastName("Muthusamy");
        employee.setAge(30);
        employee.setSex(Sex.MALE);

        //return EmployeeMapper.INSTANCE.domainToDTO(employee);
        return employeeMapper.domainToDTO(employee);
    }

    @GetMapping("/dtoToDomain")
    public Employee getAllEMployees() {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        //return EmployeeMapper.INSTANCE.dtoToDomain(employeeDTO);
        return employeeMapper.dtoToDomain(employeeDTO);
    }

}
