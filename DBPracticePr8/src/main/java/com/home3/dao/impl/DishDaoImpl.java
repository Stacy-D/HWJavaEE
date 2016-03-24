package com.home3.dao.impl;

import com.googlecode.ehcache.annotations.Cacheable;
import com.home3.dao.IDishDao;
import com.home3.entities.Dish;
import com.home3.entities.DishTypes;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */
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
    @Cacheable(cacheName = "dishesCache")
    public Dish getDish(int id) {
        Dish dish = em.find(Dish.class, id);
        return dish;
    }

    @Override
    public void saveDish(Dish dish) {
        em.merge(dish);
    }

    @Override
    public int getNumberOfDishesByType(DishTypes type) {
        Query query = em.createNamedQuery(Dish.COUNT_TYPES);
        query.setParameter("dtype", type);
        return ((Number)query.getSingleResult()).intValue();
    }

    @Override
    public int getNumberOfDishes() {
        return ((Number)em.createNamedQuery(Dish.COUNT_ALL).getSingleResult()).intValue();
    }

    @Override
    public List<Dish> getAllDishes() {
        return em.createNamedQuery(Dish.FIND_ALL).getResultList();
    }

    @Override
    @Cacheable(cacheName = "dishesCache")
    public Dish getDishById(int id) {
        Dish dish = em.find(Dish.class, id);
        return em.find(Dish.class, id);
    }
}
