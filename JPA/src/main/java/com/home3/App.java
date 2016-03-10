package com.home3;

import com.home3.entities.Dish;
import com.home3.entities.DishTypes;
import com.home3.entities.Ingredient;
import com.home3.service.IDishService;
import com.home3.service.IIngredientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



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
        Ingredient ingredient = new Ingredient();
        ingredient.setName("tomato");
        ingredient.setCalories(100);
        ingredientService.addIngredient(ingredient);
        Dish dish = new Dish(DishTypes.salad, "Ala Salad");
        dish.getIngredients().add(ingredientService.getIngredient(3));
        dish.getIngredients().add(ingredientService.getIngredient(1));
        dishService.addDish(dish);




    }
}
