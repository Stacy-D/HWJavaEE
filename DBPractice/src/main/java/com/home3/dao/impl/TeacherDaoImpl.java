package com.home3.dao.impl;

import com.home3.dao.ITeacherDao;
import com.home3.entities.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Stacy on 2/25/16.
 */
@Repository
public class TeacherDaoImpl implements ITeacherDao{
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    @Transactional
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    @Transactional
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    @Transactional
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }

}
