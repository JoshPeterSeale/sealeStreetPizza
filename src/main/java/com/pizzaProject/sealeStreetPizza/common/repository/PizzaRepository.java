package com.pizzaProject.sealeStreetPizza.common.repository;

import com.pizzaProject.sealeStreetPizza.common.model.food.Ingredient;
import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Pizza;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PizzaRepository {
    private List<Pizza> pizzas = new ArrayList<>();
    private final DoughRepository doughRepository;
    private final IngredientRepository ingredientRepository;
    public PizzaRepository(DoughRepository doughRepository,
                           IngredientRepository ingredientRepository){
        this.doughRepository = doughRepository;
        this.ingredientRepository = ingredientRepository;
        this.setPizzas();
    }

    public List<Pizza> getPizzas(){
        return this.pizzas;
    }

    public Pizza getPizzaById(int id) {
        return this.pizzas.stream().
                filter(dough ->dough.getId()==id).
                findFirst().orElseThrow(()-> new RuntimeException("Dough not found"));
    }

    public Pizza getPizzaByName(String name) {
        return this.pizzas.stream().
                filter(dough ->dough.getName()==name).
                findFirst().orElseThrow(()-> new RuntimeException("Pizza not found"));
    }

    public void setPizzas(){
        pizzas.add(new Pizza(1,"Margherita", ingredientRepository.getIngredientsByNames(Arrays.asList("mozzarella","tomato sauce")), doughRepository.getDoughByName("standard")));
    }
}
