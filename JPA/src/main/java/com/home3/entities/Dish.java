package com.home3.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */
@Entity
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private DishTypes type;

    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable(name = "dish_to_ing",
    joinColumns = @JoinColumn(name = "dish_fk"),
    inverseJoinColumns = @JoinColumn(name = "ingredient_fk"))
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DishTypes getType() {
        return type;
    }

    public void setType(DishTypes type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dish)) return false;

        Dish dish = (Dish) o;

        if (id != dish.id) return false;
        if (!name.equals(dish.name)) return false;
        if (type != dish.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + type.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;

    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public Dish() {
    }

    public Dish(DishTypes type, String name) {
        this.type = type;
        this.name = name;
    }
}
