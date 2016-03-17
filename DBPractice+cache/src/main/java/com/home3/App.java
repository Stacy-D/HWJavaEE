package com.home3;

import com.home3.entities.Dish;
import com.home3.entities.DishTypes;
import com.home3.entities.Ingredient;
import com.home3.service.IDishService;
import com.home3.service.IIngredientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IIngredientService ingredientService = (IIngredientService) context.getBean("ingrService");
        IDishService dishService = (IDishService) context.getBean("dishSer");
 /*       Ingredient ingredient = new Ingredient();
        ingredient.setName("tomato");
        ingredient.setCalories(100);
        ingredientService.addIngredient(ingredient);
        Dish dish = new Dish(DishTypes.salad, "Ala sssSalad");
        dish.getIngredients().add(ingredientService.getIngredient(3));
        dish.getIngredients().add(ingredientService.getIngredient(1));
        dishService.addDish(dish);*/
        List<Dish> dishes = dishService.getAllDishes();
        for(Dish dish: dishes){
            System.out.print(dish);
        }
        Dish dish1 = dishService.getDishById(2);
        Dish dish2 = dishService.getDishById(2);

    }
}
