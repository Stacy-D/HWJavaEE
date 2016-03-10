package com.home3.service.impl;

import com.home3.dao.IIngredientDao;
import com.home3.entities.Ingredient;
import com.home3.service.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Stacy on 3/10/16.
 */
@Service("ingrService")
public class IngredientServiceImpl implements IIngredientService {
    @Autowired
    private IIngredientDao ingredientDao;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientDao.addIngredient(ingredient);
    }

    @Override
    public Ingredient getIngredient(int id) {
        if(id < 0)
            throw new IllegalArgumentException();
        return ingredientDao.getIngredient(id);
    }
}
