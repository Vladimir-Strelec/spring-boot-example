package com.example.spring_boot_example.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getListOfEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping
    public List<ModelEmployee> getListModelEmployee() {
        return employeeService.getModelEmployees();
    }
}
