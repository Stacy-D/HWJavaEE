package com.home3.service.impl;

import com.home3.dao.ITeacherDao;
import com.home3.entities.Teacher;
import com.home3.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Stacy on 2/25/16.
 */
@Service("teachersWorker")
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherDao teachersDao;
    public Teacher addTeacher(Teacher teacher){
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added "+teacher);
        return teacher;
    }
    public Teacher getTeacherById(int id){
        return teachersDao.getTeacherById(id);
    }
    public void saveTeacher(Teacher teacher){
        teachersDao.saveTacher(teacher);
        System.out.println("Teacher has been saved "+teacher);
    }

}
