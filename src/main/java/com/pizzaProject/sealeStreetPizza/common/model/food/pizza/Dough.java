package com.pizzaProject.sealeStreetPizza.common.model.food.pizza;

import com.pizzaProject.sealeStreetPizza.common.model.food.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Dough {
    double mass;
    double hydration;
    double saltPercentage;
    double yeastPercentage;
    List<Item> extraIngredients;


    public Dough(double m, double h, double s, double y) {
        this.mass = m;
        this.hydration = h;
        this.saltPercentage = s;
        this.yeastPercentage = y;
    }
}
