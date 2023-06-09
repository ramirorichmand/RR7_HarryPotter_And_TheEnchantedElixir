package com.harrypotterthingy.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne
    private Student student;

    @ManyToMany
    private Set<Ingredient> ingredients;

    public Recipe(String name, Student student, Set<Ingredient> ingredients) {
        this.name = name;
        this.student = student;
        this.ingredients = ingredients;
    }
}
