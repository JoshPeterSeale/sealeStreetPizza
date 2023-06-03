package com.pizzaProject.sealeStreetPizza.common.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataBaseLoader implements CommandLineRunner {
    public final CustomerRepo customerRepo;

    @Autowired
    public CustomerDataBaseLoader(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
