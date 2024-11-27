package com.example.schoolmanagement.model;

import java.util.Date;

public class Fee {
    private Student student;
    private double amount;
    private Date paymentDate;
    private String paymentMethod;

    // Constructors, getters, and setters
    public Fee(Student student, double amount, Date paymentDate, String paymentMethod) {
        this.student = student;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public Student getStudent() {
        return student;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
