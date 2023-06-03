package com.pizzaProject.sealeStreetPizza.common.model.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Person {
    @Id
    public @GeneratedValue long id;
    public String name;
    public String gender;
    public int age;

    public String toString(long id, String name, String gender, int age) {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
        }
}
