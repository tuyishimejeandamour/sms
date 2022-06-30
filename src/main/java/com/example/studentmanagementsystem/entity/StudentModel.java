package com.example.studentmanagementsystem.entity;

import javax.persistence.*;

@Entity()
@Table(name = "students")
public class StudentModel {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String name;
    @Column()
    private int age;
    @Column(name = "email",unique = true)
    private  String email;
    @Column()
    private String classroom;
    public StudentModel(){}

    public StudentModel(String name, int age, String email, String classroom) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.classroom = classroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
