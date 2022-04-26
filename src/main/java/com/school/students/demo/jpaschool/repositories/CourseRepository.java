package com.school.students.demo.jpaschool.repositories;

import com.school.students.demo.jpaschool.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findByNameIgnoreCase(String name);
}