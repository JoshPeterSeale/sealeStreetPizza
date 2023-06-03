package com.pizzaProject.sealeStreetPizza.common.model.menu;

import com.pizzaProject.sealeStreetPizza.common.model.drink.AlcoholicDrink;
import com.pizzaProject.sealeStreetPizza.common.model.drink.SoftDrink;
import com.pizzaProject.sealeStreetPizza.common.model.food.pasta.Pasta;
import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Pizza;

import java.util.List;

public class Menu {
    enum menuType{
        Breakfast,
        Lunch,
        Dinner,
        Dessert
    }
    List food;
    List<SoftDrink> softDrinks;
    List<AlcoholicDrink> alcoholicDrinks;
}
