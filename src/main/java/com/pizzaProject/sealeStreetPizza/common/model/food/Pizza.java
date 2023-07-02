package com.pizzaProject.sealeStreetPizza.common.model.food;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="pizza")
public class Pizza {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    List<String> ingredients;

    public Pizza(String name, List<String> ingredients){
        this.name=name;
        this.ingredients=ingredients;
    }
}



