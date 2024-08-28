package com.example.EmployeeManagementSystem.dto;

public class EmployeeDTO {
    private String name;
    private String email;

    public EmployeeDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
