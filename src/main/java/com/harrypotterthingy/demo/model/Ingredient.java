package com.harrypotterthingy.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }
}
