package dao.impl;

import dao.IIngredientDao;
import entities.Ingredient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Stacy on 3/10/16.
 */
@Repository
public class IngredientDaoImpl implements IIngredientDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        em.persist(ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredient(int id) {
        return em.find(Ingredient.class, id);
    }

    @Override
    public void saveIngredient(Ingredient inredient) {
        em.merge(inredient);
    }
}
