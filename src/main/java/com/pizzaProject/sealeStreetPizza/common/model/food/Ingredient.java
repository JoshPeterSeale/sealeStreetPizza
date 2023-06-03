package com.pizzaProject.sealeStreetPizza.common.model.food;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Ingredient {
    Item ingredient; // ingredient object
    double costOfIngredient; // cost of ingredient per 100g
    double mass; // mass of the ingredient used for the food item
}
