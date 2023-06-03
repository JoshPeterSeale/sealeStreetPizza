package com.pizzaProject.sealeStreetPizza.common.model.drink;

import com.pizzaProject.sealeStreetPizza.common.model.food.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
// this class defines food and drink items- not homemade- e.g. coke, cannoli...
public class AlcoholicDrink extends Item {
}
