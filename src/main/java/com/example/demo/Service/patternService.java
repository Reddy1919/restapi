package com.example.demo.Service;


import org.springframework.stereotype.Service;

import com.example.demo.Repository.patternRepository;
import com.example.demo.models.pattern;

import java.util.List;
import java.util.Optional;

@Service
public class patternService {
    private final patternRepository employeeRepository;

    public patternService(patternRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<pattern> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public pattern saveEmployee(pattern employee) {
        return employeeRepository.save(employee);
    }

    public Optional<pattern> getEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }
}
