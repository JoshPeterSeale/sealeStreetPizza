package com.pizzaProject.sealeStreetPizza.common.model.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.ToString;
@ToString

@Entity
public class Employee extends Person{
    @Id
    public @GeneratedValue long employeeID;
    @ManyToOne
    public Person person;
    public String role;
    public int salary;

    public Employee(Person person, String role, int salary) {
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
        this.role = role;
        this.salary = salary;
    }


}
