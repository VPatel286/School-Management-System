# **School Management System**

The **School Management System** is a web-based application designed to streamline administrative tasks in educational institutions. It provides features for managing student and teacher information, attendance tracking, grade handling, and reporting.

---

## **Features**

- **User Management**
  - Role-based access for Admin, Teacher, and Student.
- **Student Information Management**
  - Store and manage student details, attendance, and grades.
- **Course and Scheduling Management**
  - Create and assign courses and manage class schedules.
- **Attendance Tracking**
  - Record, track, and generate attendance reports.
- **Grade Reporting**
  - Input, update, and view student grades.
- **Reports**
  - Generate detailed reports on student performance and attendance.

---

## **Technologies Used**

### **Backend**
- Java (Spring Boot Framework)
- Maven (Dependency Management)
- MySQL (Database)

### **Frontend**
- HTML5
- CSS3
- JavaScript

### **Development Tools**
- IntelliJ IDEA / VS Code
- Postman (API Testing)
- Git and GitHub

---

## **Project Structure**

```plaintext
SchoolManagementSystem/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com.example.school/
│   │   │   │       ├── controllers/
│   │   │   │       ├── models/
│   │   │   │       ├── repositories/
│   │   │   │       └── SchoolManagementSystemApplication.java
│   │   │   ├── resources/
│   │   │       ├── application.properties
│   │   │       └── data.sql
│   │   ├── test/
│   ├── pom.xml
├── frontend/
│   ├── css/
│   ├── js/
│   ├── index.html
│   ├── login.html
│   └── dashboard.html
└── README.md
