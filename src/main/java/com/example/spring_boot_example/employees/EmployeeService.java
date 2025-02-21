package com.example.spring_boot_example.employees;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getAllEmployee() {
        Employee b = new Employee.Builder()
                .id(Long.min(1, 2))
                .name("Vova")
                .email("vgvgv@.com")
                .age(36)
                .phone("+76656565656")
                .build();
        return List.of(b);
    }
    public List<ModelEmployee> getModelEmployees() {
        ModelEmployee modelEmployee = new ModelEmployee(1);
        return List.of(modelEmployee);
    }
}
