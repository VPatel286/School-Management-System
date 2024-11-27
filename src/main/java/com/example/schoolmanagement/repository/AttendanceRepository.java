package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Attendance;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AttendanceRepository {
    private List<Attendance> attendances = new ArrayList<>();

    public void addAttendance(Attendance attendance) {
        attendances.add(attendance);
    }

    public List<Attendance> getAllAttendances() {
        return attendances;
    }

    public List<Attendance> getAttendancesByStudentId(int studentId) {
        List<Attendance> studentAttendances = new ArrayList<>();
        for (Attendance attendance : attendances) {
            if (attendance.getStudent().getId() == studentId) {
                studentAttendances.add(attendance);
            }
        }
        return studentAttendances;
    }
}
