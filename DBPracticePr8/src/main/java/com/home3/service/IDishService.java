package com.home3.service;

import com.home3.entities.Dish;
import com.home3.entities.DishTypes;

import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */
public interface IDishService {
    Dish addDish(Dish dish);
    int getNumberOfDishesByType(DishTypes type);
    int getNumberOfDishes();
    List<Dish> getAllDishes();
    Dish getDishById(int id);
}
