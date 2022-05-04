package com.school.students.demo.jpaschool.services;

import com.school.students.demo.jpaschool.entities.StudentCourse;
import com.school.students.demo.jpaschool.repositories.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> queryCoursesByStudent(Integer studentIdstudent) {
        return studentCourseRepository.queryCoursesByStudent(studentIdstudent);
    }

    public List<StudentCourse> queryStudentsByCourse(Integer idstudentCourse) {
        return studentCourseRepository.queryCoursesByStudent(idstudentCourse);
    }

    public boolean findCourseWithoutStudents(){
        return studentCourseRepository.findCourseWithoutStudents();
    }

    public boolean findStudentsWithoutCourse(){
        return studentCourseRepository.findStudentsWithoutCourse();
    }

}
