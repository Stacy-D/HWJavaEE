package com.home3.dao.impl;

import com.home3.dao.IDishDao;
import com.home3.entities.Dish;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Stacy on 3/10/16.
 */
@Transactional
@Repository
public class DishDaoImpl implements IDishDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Dish addDish(Dish dish) {
        em.persist(dish);
        return dish;
    }

    @Override
    public Dish getDish(int id) {
        return em.find(Dish.class, id);
    }

    @Override
    public void saveDish(Dish dish) {
        em.merge(dish);
    }
}
