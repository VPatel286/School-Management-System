package com.example.schoolmanagement.model;

public class Student extends User {
    private String grade;
    private String parentContact;

    // Constructors, getters, and setters
    public Student(int id, String name, String email, String password, String grade, String parentContact) {
        super(id, name, email, password);
        this.grade = grade;
        this.parentContact = parentContact;
    }

    public String getGrade() {
        return grade;
    }

    public String getParentContact() {
        return parentContact;
    }
}
