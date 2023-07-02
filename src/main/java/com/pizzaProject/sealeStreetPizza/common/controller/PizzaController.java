package com.pizzaProject.sealeStreetPizza.common.controller;

import com.pizzaProject.sealeStreetPizza.common.model.food.Pizza;
import com.pizzaProject.sealeStreetPizza.common.model.food.PizzaInput;
import com.pizzaProject.sealeStreetPizza.common.repository.PizzaRepo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PizzaController {

    private final PizzaRepo pizzaRepo;

    public PizzaController(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    @QueryMapping
    public List<Pizza> getPizzas() {
        return pizzaRepo.findAll();
    }

    @MutationMapping
    public Pizza createPizza(@Argument PizzaInput pizzaInput){
        return pizzaRepo.save(new Pizza(pizzaInput.name(),pizzaInput.ingredients()));
    }
}
