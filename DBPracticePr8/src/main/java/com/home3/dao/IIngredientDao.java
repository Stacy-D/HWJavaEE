package com.home3.dao;

import com.home3.entities.Ingredient;

/**
 * Created by Stacy on 3/10/16.
 */
public interface IIngredientDao {
    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredient(int id);

    void saveIngredient(Ingredient inredient);
}
