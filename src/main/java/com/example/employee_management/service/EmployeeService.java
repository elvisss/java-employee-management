package com.example.employee_management.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.employee_management.model.Employee;
import com.example.employee_management.repository.EmployeeRepository;

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        return employee;
    }

    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }
}
