package com.pizzaProject.sealeStreetPizza.common.model.food;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
public class Ingredient {
    int id;
    String name; // the name of the ingredient
    double cost; // the cost of the ingredient per 100g
    int mass; // mass of the ingredient used for the food item
}
