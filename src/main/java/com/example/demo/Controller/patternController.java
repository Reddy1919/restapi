package com.example.demo.Controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.patternService;
import com.example.demo.models.pattern;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class patternController {
    private final patternService employeeService;

    public patternController(patternService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<pattern> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public pattern createEmployee(@RequestBody pattern employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/login")
    public Optional<pattern> login(@RequestBody pattern employee) {
        return employeeService.getEmployeeByUserName(employee.getUserName());
    }
}
