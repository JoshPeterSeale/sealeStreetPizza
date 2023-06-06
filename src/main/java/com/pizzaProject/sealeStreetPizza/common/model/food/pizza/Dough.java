package com.pizzaProject.sealeStreetPizza.common.model.food.pizza;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Dough {
    int id;
    String name;
    int mass;
    double hydration;
    double saltPercentage;
    double yeastPercentage;
    double cost; // cost per unit
}
