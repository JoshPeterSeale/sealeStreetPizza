package com.pizzaProject.sealeStreetPizza.common.controller;

import com.pizzaProject.sealeStreetPizza.common.model.food.Ingredient;
import com.pizzaProject.sealeStreetPizza.common.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class IngredientController {
    @Autowired
    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @QueryMapping
    public List<Ingredient> getIngredients(){
        return ingredientRepository.getIngredients();
    }

    @QueryMapping
    public Ingredient getIngredientsById(@Argument int id){
        return ingredientRepository.getIngredientById(id);
    }

    @QueryMapping
    public Ingredient getIngredientsByName(@Argument String name){
        return ingredientRepository.getIngredientByName(name);
    }

    @QueryMapping
    public List<Ingredient> getIngredientsByNames(@Argument List<String> names){
        return ingredientRepository.getIngredientsByNames(names);
    }
}
