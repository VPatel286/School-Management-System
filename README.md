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
- **Fee Management**
  - Managing Fees for students

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
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── schoolmanagement/
│   │   │           ├── controller/
│   │   │           │   └── MainController.java
│   │   │           ├── model/
│   │   │           │   ├── User.java
│   │   │           │   ├── Student.java
│   │   │           │   ├── Teacher.java
│   │   │           │   ├── Admin.java
│   │   │           │   ├── Course.java
│   │   │           │   ├── Attendance.java
│   │   │           │   └── Fee.java
│   │   │           ├── repository/
│   │   │           │   ├── UserRepository.java
│   │   │           │   ├── CourseRepository.java
│   │   │           │   ├── AttendanceRepository.java
│   │   │           │   └── FeeRepository.java
│   │   │           ├── service/
│   │   │           │   ├── UserService.java
│   │   │           │   ├── CourseService.java
│   │   │           │   ├── AttendanceService.java
│   │   │           │   └── FeeService.java
│   │   │           └── SchoolManagementApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── styles.css
│   │       │   ├── js/
│   │       │   │   └── scripts.js
│   │       │   └── views/
│   │       │       ├── index.html
│   │       │       ├── student.html
│   │       │       ├── teacher.html
│   │       │       └── course.html
│   │       └── templates/
│   │           └── main.html
│   └── test/
│       └── java/
│           └── com/
│               └── schoolmanagement/
│                   └── SchoolManagementApplicationTests.java
└── pom.xml

