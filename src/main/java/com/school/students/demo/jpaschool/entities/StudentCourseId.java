package com.school.students.demo.jpaschool.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentCourseId implements Serializable {
    private static final long serialVersionUID = 4281860997838816572L;
    @Column(name = "idstudent_course", nullable = false)
    private Integer idstudentCourse;
    @Column(name = "student_idstudent", nullable = false)
    private Integer studentIdstudent;
    @Column(name = "course_idcourse", nullable = false)
    private Integer courseIdcourse;

    public Integer getCourseIdcourse() {
        return courseIdcourse;
    }

    public void setCourseIdcourse(Integer courseIdcourse) {
        this.courseIdcourse = courseIdcourse;
    }

    public Integer getStudentIdstudent() {
        return studentIdstudent;
    }

    public void setStudentIdstudent(Integer studentIdstudent) {
        this.studentIdstudent = studentIdstudent;
    }

    public Integer getIdstudentCourse() {
        return idstudentCourse;
    }

    public void setIdstudentCourse(Integer idstudentCourse) {
        this.idstudentCourse = idstudentCourse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseIdcourse, idstudentCourse, studentIdstudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentCourseId entity = (StudentCourseId) o;
        return Objects.equals(this.courseIdcourse, entity.courseIdcourse) &&
                Objects.equals(this.idstudentCourse, entity.idstudentCourse) &&
                Objects.equals(this.studentIdstudent, entity.studentIdstudent);
    }
}