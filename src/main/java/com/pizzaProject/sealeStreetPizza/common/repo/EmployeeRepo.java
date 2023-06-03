package com.pizzaProject.sealeStreetPizza.common.repo;

import com.pizzaProject.sealeStreetPizza.common.model.person.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
