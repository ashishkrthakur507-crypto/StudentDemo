package com.ashish;

import com.ashish.entity.Employee;
import com.ashish.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentdemoApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Test saving data
        Employee emp = new Employee("Ashish", "IT");
        employeeRepository.save(emp);

        // Test fetching data
        System.out.println("Employees in DB: " + employeeRepository.findAll());
    }
}



