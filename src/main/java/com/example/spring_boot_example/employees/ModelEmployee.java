package com.example.spring_boot_example.employees;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Service
@Entity
public class ModelEmployee {
    @Id
    private long id;

    public ModelEmployee(long id) {
        this.id = id;
    }
}
