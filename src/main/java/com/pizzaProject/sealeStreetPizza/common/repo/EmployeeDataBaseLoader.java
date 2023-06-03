package com.pizzaProject.sealeStreetPizza.common.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDataBaseLoader implements CommandLineRunner {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeDataBaseLoader(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
