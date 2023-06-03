package com.pizzaProject.sealeStreetPizza.common.repo;

import com.pizzaProject.sealeStreetPizza.common.model.person.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
