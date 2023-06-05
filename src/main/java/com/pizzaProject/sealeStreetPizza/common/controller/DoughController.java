package com.pizzaProject.sealeStreetPizza.common.controller;

import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Dough;
import com.pizzaProject.sealeStreetPizza.common.repository.DoughRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DoughController {
    @Autowired
    private final DoughRepository doughRepository;

    @Autowired
    public DoughController(DoughRepository doughRepository) {
        this.doughRepository = doughRepository;
    }

    @QueryMapping
    public List<Dough> getDoughs(){
        return doughRepository.getDoughs();
    }

    @QueryMapping
    public List<String> getDoughNames(){
        return doughRepository.getDoughNames();
    }

    /*
    @QueryMapping
    public Dough getDoughById(@Argument int id){
        return doughRepository.getDoughById(id);
    }

    @QueryMapping
    public Dough getDoughById(@Argument String name){
        return doughRepository.getDoughByName(name);
    }
     */
}
