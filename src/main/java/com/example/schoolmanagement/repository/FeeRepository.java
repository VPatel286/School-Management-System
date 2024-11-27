package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Fee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FeeRepository {
    private List<Fee> fees = new ArrayList<>();

    public void addFee(Fee fee) {
        fees.add(fee);
    }

    public List<Fee> getAllFees() {
        return fees;
    }

    public List<Fee> getFeesByStudentId(int studentId) {
        List<Fee> studentFees = new ArrayList<>();
        for (Fee fee : fees) {
            if (fee.getStudent().getId() == studentId) {
                studentFees.add(fee);
            }
        }
        return studentFees;
    }
}
