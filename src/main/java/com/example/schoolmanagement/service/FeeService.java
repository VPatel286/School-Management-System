package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Fee;
import com.example.schoolmanagement.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeService {
    @Autowired
    private FeeRepository feeRepository;

    public void addFee(Fee fee) {
        feeRepository.addFee(fee);
    }

    public List<Fee> getAllFees() {
        return feeRepository.getAllFees();
    }

    public List<Fee> getFeesByStudentId(int studentId) {
        return feeRepository.getFeesByStudentId(studentId);
    }
}
