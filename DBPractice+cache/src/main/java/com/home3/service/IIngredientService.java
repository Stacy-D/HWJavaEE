package com.home3.service;

import com.home3.entities.Ingredient;
import org.springframework.stereotype.Service;

/**
 * Created by Stacy on 3/10/16.
 */
public interface IIngredientService {
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredient(int id);
}
