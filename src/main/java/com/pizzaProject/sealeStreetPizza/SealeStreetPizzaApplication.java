package com.pizzaProject.sealeStreetPizza;

import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Dough;
import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Pizza;
import com.pizzaProject.sealeStreetPizza.common.repository.DoughRepository;
import com.pizzaProject.sealeStreetPizza.common.repository.IngredientRepository;
import com.pizzaProject.sealeStreetPizza.common.repository.PizzaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SealeStreetPizzaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SealeStreetPizzaApplication.class, args);

		// testing @PostConstruct annotation
		final DoughRepository doughRepository = new DoughRepository();
		final IngredientRepository ingredientRepository = new IngredientRepository();
		List doughs = doughRepository.getDoughs().stream().
				map(dough -> Arrays.asList(dough.getId(), dough.getName())).
				collect(Collectors.toList());
		//System.out.println(doughs);

		final PizzaRepository pizzaRepository = new PizzaRepository(doughRepository,ingredientRepository);
		Pizza pizza = pizzaRepository.getPizzas().stream().
				filter(p-> p.getName()=="Margherita").
				findFirst().orElseThrow(()-> new RuntimeException("Pizza not found"));
		System.out.println(pizza.getCostOfPizza());
	}
}
