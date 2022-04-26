package com.school.students.demo.jpaschool.entities;

import javax.persistence.*;

@Table(name = "course")
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcourse", nullable = false)
    private Integer id;

    @Column(name = "name", length = 500)
    private String name;

    @Column(name = "comments", length = 1000)
    private String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}