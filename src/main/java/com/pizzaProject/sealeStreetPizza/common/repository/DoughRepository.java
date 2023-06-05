package com.pizzaProject.sealeStreetPizza.common.repository;

import com.pizzaProject.sealeStreetPizza.common.model.food.pizza.Dough;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DoughRepository {
    public List<Dough> doughs = new ArrayList<>();
    public DoughRepository(){
        this.setDoughs();
    }
    public List<Dough> getDoughs(){
        return this.doughs;
    }

    public List<String> getDoughNames(){
        return this.doughs.stream().
                map(dough -> dough.getName()).
                collect(Collectors.toList());
    }

    public Dough getDoughById(int id){
        return this.doughs.stream().
                filter(dough ->dough.getId()==id).
                findFirst().orElseThrow(()-> new RuntimeException("Dough not found"));
    }

    public Dough getDoughByName(String name){
        return this.doughs.stream().
                filter(dough ->dough.getName()==name).
                findFirst().orElseThrow(()-> new RuntimeException("Dough not found"));
    }

    public void setDoughs(){
        doughs.add(new Dough(1, "standard",250, 0.7, 0.03, 0.005, 0.20));
    }
}
