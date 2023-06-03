package com.pizzaProject.sealeStreetPizza.common.model.food.pizza;

import com.pizzaProject.sealeStreetPizza.common.model.food.Ingredient;
import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Dough;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class Pizza {
    String name;
    List<Ingredient> ingredients;
    Dough dough;
}
