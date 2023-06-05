package com.pizzaProject.sealeStreetPizza.common.repository;

import com.pizzaProject.sealeStreetPizza.common.model.food.Ingredient;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class IngredientRepository {

    public IngredientRepository(){
        this.setIngredients();
    }
    private List<Ingredient> ingredients = new ArrayList<>();

    public List<Ingredient> getIngredients(){
        return this.ingredients;
    }

    public Ingredient getIngredientById(int id){
        return this.ingredients.stream().
                filter(ingredient -> ingredient.getId()==id).
                findFirst().orElseThrow(()-> new RuntimeException("Ingredient not found"));
    }

    public Ingredient getIngredientByName(String name){
        return this.ingredients.stream().
                filter(ingredient -> ingredient.getName()==name).
                findFirst().orElseThrow(()-> new RuntimeException("Ingredient not found"));
    }

    public List<Ingredient> getIngredientsByNames(List<String> names){
        return this.ingredients.stream().
                filter(ingredient -> names.contains(ingredient.getName())).collect(Collectors.toList());
    }
    @PostConstruct
    private void init(){
        Ingredient mozzarella = new Ingredient(1, "mozzarella", 0.50, 100);
        Ingredient tomatoSauce = new Ingredient(2, "tomato sauce", 0.20, 800);
        Ingredient pepperoni = new Ingredient(3, "Pepperoni", 1.00, 50);
        ingredients.add(mozzarella);
        ingredients.add(tomatoSauce);
        ingredients.add(pepperoni);
    }

    public void setIngredients(){
        Ingredient mozzarella = new Ingredient(1, "mozzarella", 0.50, 100);
        Ingredient tomatoSauce = new Ingredient(2, "tomato sauce", 0.20, 800);
        Ingredient pepperoni = new Ingredient(3, "Pepperoni", 1.00, 50);
        ingredients.add(mozzarella);
        ingredients.add(tomatoSauce);
        ingredients.add(pepperoni);
    }
}
