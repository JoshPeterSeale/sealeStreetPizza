package com.pizzaProject.sealeStreetPizza.common.repository;

import com.pizzaProject.sealeStreetPizza.common.model.food.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PizzaRepo extends JpaRepository<Pizza, Integer> {
}
