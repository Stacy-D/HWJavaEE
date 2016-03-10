package com.home3.dao;

import com.home3.entities.Dish;

/**
 * Created by Stacy on 3/10/16.
 */
public interface IDishDao {
    Dish addDish(Dish dish);
    Dish getDish(int id);
    void saveDish(Dish dish);
}
