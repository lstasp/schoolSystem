package com.school.students.demo.jpaschool.repositories;

import com.school.students.demo.jpaschool.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByNameIgnoreCase(String name);
}