package com.example.schoolmanagement.model;

public class Teacher extends User {
    private String subject;

    // Constructors, getters, and setters
    public Teacher(int id, String name, String email, String password, String subject) {
        super(id, name, email, password);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
