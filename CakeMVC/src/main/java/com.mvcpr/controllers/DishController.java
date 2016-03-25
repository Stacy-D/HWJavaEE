package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IDishService;

/**
 * Created by Stacy on 3/25/16.
 */
@Controller
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private IDishService dishService;

    @RequestMapping(value = "/all")
    public String getAllDishes(Model model){
        model.addAttribute("dishes",dishService.getAllDishes());
        return "home";
    }
}
