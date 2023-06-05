package com.pizzaProject.sealeStreetPizza;

import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Dough;
import com.pizzaProject.sealeStreetPizza.common.repository.DoughRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        final DoughRepository doughRepository = new DoughRepository();
        doughRepository.setDoughs();
        List doughs = doughRepository.getDoughs().stream().
                map(dough -> Arrays.asList(dough.getId(), dough.getName())).
                collect(Collectors.toList());
        System.out.println(doughs);
    }
}
