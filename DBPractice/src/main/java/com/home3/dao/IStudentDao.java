package com.home3.dao;

import com.home3.entities.Student;

/**
 * Created by Stacy on 2/25/16.
 */
public interface IStudentDao {
    void addStudent(Student student);
    Student getStudentById(int id);

}
