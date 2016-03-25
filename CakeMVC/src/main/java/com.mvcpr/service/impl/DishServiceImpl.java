package service.impl;

import dao.IDishDao;
import entities.Dish;
import entities.DishTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.IDishService;

import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */

@Service("dishSer")
public class DishServiceImpl implements IDishService {
    @Autowired
    private IDishDao dishDao;
    @Override
    @Transactional
    public Dish addDish(final Dish dish) {
                     dishDao.addDish(dish);
        return dish;
    }
    @Transactional(propagation= Propagation.REQUIRED, readOnly=true)
    @Override
    public int getNumberOfDishesByType(DishTypes type) {
        return dishDao.getNumberOfDishesByType(type);
    }
    @Transactional(propagation=Propagation.REQUIRED, readOnly=true)
    @Override
    public int getNumberOfDishes() {
        return dishDao.getNumberOfDishes();
    }
    @Transactional(propagation=Propagation.REQUIRED, readOnly=true)
    @Override
    public List<Dish> getAllDishes() {
        return dishDao.getAllDishes();
    }
    @Transactional(propagation=Propagation.REQUIRED, readOnly=true)
    @Override
    public Dish getDishById(int id) {
        return dishDao.getDishById(id);
    }
}
