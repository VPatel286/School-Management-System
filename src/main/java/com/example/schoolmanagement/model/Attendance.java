package com.example.schoolmanagement.model;

import java.util.Date;

public class Attendance {
    private Student student;
    private Date date;
    private boolean isPresent;

    // Constructors, getters, and setters
    public Attendance(Student student, Date date, boolean isPresent) {
        this.student = student;
        this.date = date;
        this.isPresent = isPresent;
    }

    public Student getStudent() {
        return student;
    }

    public Date getDate() {
        return date;
    }

    public boolean isPresent() {
        return isPresent;
    }
}
