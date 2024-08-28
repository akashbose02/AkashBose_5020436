package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.projection.EmployeeNameEmailProjection;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Endpoint using interface-based projection
    @GetMapping("/employee-projection")
    public List<EmployeeNameEmailProjection> getEmployeeProjections(@RequestParam String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    // Endpoint using class-based projection
    @GetMapping("/employee-dto")
    public List<EmployeeDTO> getEmployeeDTOs(@RequestParam String departmentName) {
        return employeeRepository.findEmployeeDTOsByDepartmentName(departmentName);
    }
}
