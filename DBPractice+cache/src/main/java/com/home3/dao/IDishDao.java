package com.home3.dao;

import com.home3.entities.Dish;
import com.home3.entities.DishTypes;

import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */
public interface IDishDao {
    Dish addDish(Dish dish);
    Dish getDish(int id);
    void saveDish(Dish dish);
    int getNumberOfDishesByType(DishTypes type);
    int getNumberOfDishes();
    List<Dish> getAllDishes();
    Dish getDishById(int id);
}
