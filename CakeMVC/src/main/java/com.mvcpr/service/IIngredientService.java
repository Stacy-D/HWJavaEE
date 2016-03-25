package service;

import entities.Ingredient;

/**
 * Created by Stacy on 3/10/16.
 */
public interface IIngredientService {
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(int id);
}
