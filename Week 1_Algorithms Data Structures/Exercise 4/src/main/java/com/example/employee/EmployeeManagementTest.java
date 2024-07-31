package com.example.employee;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagement empMgmt = new EmployeeManagement(5);

        Employee emp1 = new Employee("E001", "Chayan", "CEO", 300000);
        Employee emp2 = new Employee("E002", "Shreyasi", "Manager", 805000);
        Employee emp3 = new Employee("E003", "Debomita", "Analyst", 65000);

        // Add employees
        empMgmt.addEmployee(emp1);
        empMgmt.addEmployee(emp2);
        empMgmt.addEmployee(emp3);

        // Traverse employees
        System.out.println("Traversing employees:");
        empMgmt.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for employee with ID 'E002':");
        System.out.println(empMgmt.searchEmployee("E002"));

        // Delete an employee
        System.out.println("\nDeleting employee with ID 'E001':");
        empMgmt.deleteEmployee("E001");

        // Traverse employees again
        System.out.println("\nTraversing employees after deletion:");
        empMgmt.traverseEmployees();
    }
}
