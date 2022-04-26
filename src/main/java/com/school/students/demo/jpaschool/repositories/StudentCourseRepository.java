package com.school.students.demo.jpaschool.repositories;

import com.school.students.demo.jpaschool.entities.StudentCourse;
import com.school.students.demo.jpaschool.entities.StudentCourseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, StudentCourseId> {
    List<StudentCourse> findById_IdstudentCourse(@NonNull Integer idstudentCourse);

    List<StudentCourse> findById_StudentIdstudent(@NonNull Integer studentIdstudent);

    boolean existsById_IdstudentCourse(@NonNull Integer idstudentCourse);

    boolean existsById_StudentIdstudent(@NonNull Integer studentIdstudent);
}