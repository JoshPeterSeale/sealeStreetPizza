package com.pizzaProject.sealeStreetPizza.common.model.person;

import com.pizzaProject.sealeStreetPizza.common.model.person.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
public class Customer extends Person {
    @Id
    public @GeneratedValue long customerID;
    @ManyToOne
    public Person person;
    public int stickerCount;

    public Customer(){
    }
    public Customer(Person person, int stickerCount) {
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
        this.stickerCount = stickerCount;
    }
}
