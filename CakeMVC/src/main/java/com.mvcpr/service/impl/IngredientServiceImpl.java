package service.impl;

import dao.IIngredientDao;
import entities.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.IIngredientService;

/**
 * Created by Stacy on 3/10/16.
 */
@Service("ingrService")
public class IngredientServiceImpl implements IIngredientService {
    @Autowired
    private IIngredientDao ingredientDao;
    @Transactional(propagation= Propagation.REQUIRED)
    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientDao.addIngredient(ingredient);
    }
    @Transactional(propagation=Propagation.REQUIRED, readOnly=true)
    @Override
    public Ingredient getIngredient(int id) {
        if(id < 0)
            throw new IllegalArgumentException();
        return ingredientDao.getIngredient(id);
    }
}
