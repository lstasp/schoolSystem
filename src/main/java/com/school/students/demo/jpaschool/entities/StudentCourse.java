package com.school.students.demo.jpaschool.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Table(name = "student_course", indexes = {
        @Index(name = "fk_student_course_student_idx", columnList = "student_idstudent"),
        @Index(name = "fk_student_course_course1_idx", columnList = "course_idcourse")
})
@Entity
public class StudentCourse {
    @EmbeddedId
    private StudentCourseId id;

    public StudentCourseId getId() {
        return id;
    }

    public void setId(StudentCourseId id) {
        this.id = id;
    }
}