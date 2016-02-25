package com.home3;

import com.home3.entities.Student;
import com.home3.entities.Teacher;
import com.home3.service.IStudentService;
import com.home3.service.ITeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        IStudentService studentService = (IStudentService) context.getBean("studService");
        Student testStudent = new Student("Vlad Valt", 5);
        studentService.saveStudentToDB(testStudent);
        ITeacherService teacherService = (ITeacherService)context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Joe");
        teacher.setLastname("Foo");
        teacher.setCellphone("+585858585858");
        teacher = teacherService.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        teacherService.saveTeacher(teacher);



    }
}
