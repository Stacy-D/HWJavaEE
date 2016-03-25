package service;
import entities.Dish;
import entities.DishTypes;

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
