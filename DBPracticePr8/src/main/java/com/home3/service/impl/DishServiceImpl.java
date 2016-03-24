package com.home3.service.impl;

import com.home3.dao.IDishDao;
import com.home3.entities.Dish;
import com.home3.entities.DishTypes;
import com.home3.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

/**
 * Created by Stacy on 3/10/16.
 */

@Service("dishSer")
public class DishServiceImpl implements IDishService {
    @Autowired
    private TransactionTemplate transactionTemplate;
    @Autowired
    private IDishDao dishDao;
    @Override
    public Dish addDish(final Dish dish) {
        transactionTemplate.execute(new TransactionCallback<Object>(){
            public Void doInTransaction(TransactionStatus txStatus){
                try{

                     dishDao.addDish(dish);
                    System.out.println("Dish has been added "+dish);
                }catch (RuntimeException e){
                    txStatus.setRollbackOnly();
                    throw e;
                }
                return null;
            }
        });
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
