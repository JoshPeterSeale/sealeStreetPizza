package com.pizzaProject.sealeStreetPizza.common.service;

import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Pizza;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    // cost of pizza
    public double costOfPizza(Pizza pizza){
       double cost = pizza.getIngredients().stream()
               .mapToDouble(ingredient -> ingredient.getCost()*ingredient.getMass())
               .sum();
       return cost;
    }
}
