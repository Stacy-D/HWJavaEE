package com.home3.service.impl;

import com.home3.dao.IDishDao;
import com.home3.entities.Dish;
import com.home3.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
