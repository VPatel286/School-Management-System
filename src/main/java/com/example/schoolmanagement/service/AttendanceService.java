package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Attendance;
import com.example.schoolmanagement.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public void addAttendance(Attendance attendance) {
        attendanceRepository.addAttendance(attendance);
    }

    public List<Attendance> getAllAttendances() {
        return attendanceRepository.getAllAttendances();
    }

    public List<Attendance> getAttendancesByStudentId(int studentId) {
        return attendanceRepository.getAttendancesByStudentId(studentId);
    }
}
