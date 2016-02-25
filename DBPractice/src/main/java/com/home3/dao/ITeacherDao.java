package com.home3.dao;

import com.home3.entities.Teacher;

/**
 * Created by Stacy on 2/25/16.
 */
public interface ITeacherDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);

}
