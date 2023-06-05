package com.pizzaProject.sealeStreetPizza.common.controller;

import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Pizza;
import com.pizzaProject.sealeStreetPizza.common.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PizzaController {

    @Autowired
    public final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @QueryMapping
    public List<Pizza> getPizzas() {
        List<Pizza> pizzas = pizzaRepository.getPizzas();
        return pizzas;
    }

    @QueryMapping
    public Pizza getPizzaById(@Argument int id){
        return pizzaRepository.getPizzaById(id);
    }

    @QueryMapping
    public Pizza getPizzaByName(@Argument String name){
        return pizzaRepository.getPizzaByName(name);
    }

}
