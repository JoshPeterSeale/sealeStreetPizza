package com.pizzaProject.sealeStreetPizza.common.model.food.pizza;

import com.pizzaProject.sealeStreetPizza.common.model.food.Ingredient;
import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Dough;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Pizza {
    int id;
    String name;
    List<Ingredient> ingredients;
    Dough dough;
    double costOfPizza;

    public Pizza(int id, String name, List<Ingredient> ingredients, Dough dough) {
        setName(name);
        setIngredients(ingredients);
        setDough(dough);
    }

    public void setCostOfPizza() {
        this.costOfPizza = this.getCostOfPizza();
    }
}
