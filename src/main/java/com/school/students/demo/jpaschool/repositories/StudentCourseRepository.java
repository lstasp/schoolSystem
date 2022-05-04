package com.school.students.demo.jpaschool.repositories;

import com.school.students.demo.jpaschool.entities.StudentCourse;
import com.school.students.demo.jpaschool.entities.StudentCourseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, StudentCourseId> {
    List<StudentCourse> findById_IdstudentCourse(@NonNull Integer idstudentCourse);

    List<StudentCourse> findById_StudentIdstudent(@NonNull Integer studentIdstudent);

    boolean existsById_IdstudentCourse(@NonNull Integer idstudentCourse);

    boolean existsById_StudentIdstudent(@NonNull Integer studentIdstudent);

    @Query("select s from StudentCourse s where s.id.studentIdstudent = ?1")
    List<StudentCourse> queryCoursesByStudent(Integer studentIdstudent);

    @Query("select s from StudentCourse s where s.id.idstudentCourse = ?1")
    List<StudentCourse> queryStudentsByCourse(Integer idstudentCourse);

    @Query("select (count(s) > 0) from StudentCourse s where s.id.idstudentCourse is null")
    boolean findCourseWithoutStudents();

    @Query("select (count(s) > 0) from StudentCourse s where s.id.studentIdstudent is null")
    boolean findStudentsWithoutCourse();
}