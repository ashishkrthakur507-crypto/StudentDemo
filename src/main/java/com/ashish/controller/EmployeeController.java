package com.ashish.controller;

import com.ashish.entity.Employee;
import com.ashish.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee( @RequestBody Employee employee) {
        Employee saveEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
    @PostMapping("/save/id")
    public ResponseEntity<Employee> saveEmployees( @RequestBody Employee employee) {
        Employee saveEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

}
