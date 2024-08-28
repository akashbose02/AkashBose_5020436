package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.Employee;
import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.projection.EmployeeNameEmailProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Use the projection to fetch only name and email
    List<EmployeeNameEmailProjection> findByDepartmentName(String departmentName);
    // Use a custom query to project data into EmployeeDTO
    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDTO(e.name, e.email) FROM Employee e WHERE e.department.name = :departmentName")
    List<EmployeeDTO> findEmployeeDTOsByDepartmentName(String departmentName);
}
