package com.home3.service.impl;

import com.home3.dao.IDishDao;
import com.home3.entities.Dish;
import com.home3.entities.DishTypes;
import com.home3.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */
@Service("dishSer")
public class DishServiceImpl implements IDishService {
    @Autowired
    private IDishDao dishDao;
    @Override
    public Dish addDish(Dish dish) {
        return dishDao.addDish(dish);
    }

    @Override
    public int getNumberOfDishesByType(DishTypes type) {
        return dishDao.getNumberOfDishesByType(type);
    }

    @Override
    public int getNumberOfDishes() {
        return dishDao.getNumberOfDishes();
    }

    @Override
    public List<Dish> getAllDishes() {
        return dishDao.getAllDishes();
    }

    @Override
    public Dish getDishById(int id) {
        return dishDao.getDishById(id);
    }
}
