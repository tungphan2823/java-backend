
---

# Java Web Application for Course and Student Management

## Description

This Java web application provides a RESTful API for managing courses and students. It allows users to perform CRUD (Create, Read, Update, Delete) operations on courses and students, as well as manage student enrollments in courses.

## Setup

### Prerequisites

- Java JDK 8 or later
- Apache Tomcat Server
- PostgreSQL Database

### Installation Steps

1. Clone the repository to your local machine.
2. Configure the `jdbcURL`, `jdbcUserName`, and `jdbcPassword` in `CourseDAO.java`, `SJCDAO.java` and `StudentDAO.java` to match your PostgreSQL database credentials.
3. Deploy the application to the Apache Tomcat Server.
4. Ensure the PostgreSQL server is running and accessible.

## API Endpoints

### Courses

- **GET `/courses`**: Fetch all courses.
- **GET `/courses/{courseID}`**: Fetch a specific course by ID.
- **POST `/courses`**: Add a new course.
- **PUT `/courses/{courseID}`**: Update an existing course by ID.
- **DELETE `/courses/{courseID}`**: Delete a course by ID.

### Students

- **GET `/students`**: Fetch all students.
- **GET `/students/{studentID}`**: Fetch a specific student by ID.
- **POST `/students`**: Add a new student.
- **PUT `/students/{studentID}`**: Update an existing student by ID.
- **DELETE `/students/{studentID}`**: Delete a student by ID.

### Student-Course Enrollment (SJC)

- **GET `/SJC`**: Fetch all student-course enrollments.
- **GET `/SJC/{studentID}`**: Fetch all courses a specific student is enrolled in.
- **GET `/SJC/{courseID}`**: Fetch all students enrolled in a specific course.
- **POST `/SJC`**: Enroll a student in a course.
- **DELETE `/SJC/{studentID}/{courseID}`**: Remove a student's enrollment in a course.


