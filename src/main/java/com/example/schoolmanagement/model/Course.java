package com.example.schoolmanagement.model;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;

    // Constructors, getters, and setters
    public Course(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
