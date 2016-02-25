package com.home3.service;

import com.home3.entities.Teacher;

/**
 * Created by Stacy on 2/25/16.
 */
public interface ITeacherService {
    Teacher addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
