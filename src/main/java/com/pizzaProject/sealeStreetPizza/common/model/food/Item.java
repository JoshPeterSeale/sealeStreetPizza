package com.pizzaProject.sealeStreetPizza.common.model.food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    String name; // the name of the ingredient
    double cost; // the cost of the ingredient per 100g
}