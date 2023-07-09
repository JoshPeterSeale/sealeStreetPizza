package com.pizzaProject.sealeStreetPizza.common.controller;

import com.pizzaProject.sealeStreetPizza.common.model.food.Pizza;
import com.pizzaProject.sealeStreetPizza.common.model.food.PizzaInput;
import com.pizzaProject.sealeStreetPizza.common.repository.PizzaRepo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
public class PizzaController {

    private final PizzaRepo pizzaRepo;

    public PizzaController(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    @CrossOrigin
    @QueryMapping
    public List<Pizza> getPizzas() {
        return pizzaRepo.findAll();
    }

    @CrossOrigin
    @PreAuthorize("hasRole('ADMIN')")
    @MutationMapping
    public Pizza createPizza(@Argument PizzaInput pizzaInput){
        return pizzaRepo.save(new Pizza(pizzaInput.name(),pizzaInput.ingredients()));
    }
}
