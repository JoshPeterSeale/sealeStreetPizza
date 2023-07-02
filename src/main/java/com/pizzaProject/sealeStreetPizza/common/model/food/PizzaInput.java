package com.pizzaProject.sealeStreetPizza.common.model.food;

import lombok.AllArgsConstructor;

import java.util.List;


public record PizzaInput(String name, List<String> ingredients) {
}
