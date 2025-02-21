# University Management System 📚...................

A comprehensive **University Management System** designed to streamline student and faculty data management, academic tracking, fee handling, and more. This system offers a centralized database solution to manage and optimize various university operations with ease.

![University Management System Banner](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/Main%20Page)

---

## 📑 Table of Contents
- [About](#about)
- [Features](#features)
- [Setup](#setup)
- [Database Structure](#database-structure)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

---

## 📘 About
The **University Management System** is a database-driven project that simplifies the management of student and faculty data, fee records, subjects, marks, and leaves, all within a single platform. It’s built using **MySQL** for database management, making it efficient and scalable for universities of all sizes.

---

## ✨ Features
- **Student and Faculty Management**: Handles personal details, academic records, and contact information for students and faculty.
- **Fee Structure and Payments**: Tracks course fee structures and individual student payments.
- **Leave Management**: Manages student and faculty leaves with date and duration tracking.
- **Academic Progress Tracking**: Organizes subjects and marks for each student.
- **Authentication System**: Secured login for admin and staff access.

---

## ⚙️ Setup

To set up the University Management System locally, follow these steps:

### 1. Clone the Repository

Open your terminal and run the following command to clone the repository:
```bash
git clone https://github.com/yourusername/university-management-system.git
cd university-management-system
```

### 2. Setup Database 
1. Import the universitymanagementsystem.sql file into your MySQL database.
2. Run each SQL command provided in the /sql/ directory to create the necessary tables and insert initial data

### 3. Configure Database Connection
Edit the database configuration in the Conn.java file located in the src/university/management/system/university/ directory. Update the database URL, username, and password as per your MySQL setup.

### 4.Start the Application
1. Open the project in your preferred development environment (such as NetBeans or IntelliJ IDEA).
2. Compile and run the main application file (e.g., Project.java) found in the src/university/management/system/university/ directory.

### 5. Finally Host your Project

1. on the top you see a run button go on run button and click Clean and build button to host
2. After you click to host it start to host your project and save it the name of dist file 
3. Now your project is host you open your project on clicking dist file only without open your code editor.
   
## 📂 Folder Structure

The following is the folder structure for this project:

```plaintext
University Management System/
├── build/                             # Build files generated by the IDE
├── dist/                              # Distribution files
├── nbproject/                         # NetBeans project files
├── src/                               # Source files
│   ├── icons/                         # Icons used in the UI
│   └── university/
│       └── management/
│           └── system/
│               └── university/        # Main application package
│                   ├── About.java                # About section for the system
│                   ├── AddStudent.java           # Adding new student records
│                   ├── AddTeacher.java           # Adding new teacher records
│                   ├── Conn.java                 # Database connection file
│                   ├── EnterMarks.java           # Entering marks for students
│                   ├── ExaminationDetails.java   # Managing exam details
│                   ├── FeeStructure.java         # Fee structure information
│                   ├── Login.java                # Login functionality
│                   ├── Marks.java                # Marks management
│                   ├── Project.java              # Main project file
│                   ├── Splash.java               # Splash screen
│                   ├── StudentDetails.java       # Detailed student information
│                   ├── StudentFeeForm.java       # Student fee submission form
│                   ├── StudentLeave.java         # Student leave requests
│                   ├── StudentLeaveDetails.java  # Details of student leaves
│                   ├── TeacherDetails.java       # Detailed teacher information
│                   ├── TeacherLeave.java         # Teacher leave requests
│                   ├── TeacherLeaveDetails.java  # Details of teacher leaves
│                   ├── UpdateStudent.java        # Update student records
│                   ├── UpdateTeacher.java        # Update teacher records
│                   └── attendance.java           # Attendance tracking
├── test/                              # Test files
├── Libraries/                         # External libraries
│   ├── mysql-connector-java-8.0.28.jar    # MySQL Connector for database connection
│   ├── jcalendar-tz-1.3.3-4.jar           # JCalendar for date handling
│   └── rs2xml.jar                         # Library for displaying result sets in JTable
├── build.xml                          # Build configuration file
└── manifest.mf                        # Manifest file

```
## 🗄️ Database Structure
### Tables
1. Login - Stores user credentials for system access.
2. Student - Records details about each student.
3. Teacher - Records details about each teacher.
4. StudentLeave - Stores student leave applications.
5. TeacherLeave - Stores faculty leave applications.
6. Subject - Contains subjects assigned to students by semester.
7. Marks - Records students' marks for each subject.
8. Fee - Stores course fee details.
9. CollegeFee - Tracks individual student fee payments

### 💻 Usage
1. Student Enrollment: Admins can add and manage student records, including course and subject enrollment.
2. Fee Management: Admins set course fees and track student payments.
3. Leave Tracking: Admins can record leave requests for both students and teachers.
4. Marks Entry: Faculty can add marks for students for each subject.

## Screenshots 📷

Here are some screenshots of the University Management System:

### 1. Login Page 📷
![Login Page](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/Login%20Page)

### 2. Dashboard 📷
![Dashboard](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/Main%20Page)

### 3. Teacher Management Page 📷

![Student Management](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/New%20Teacher%20Page)

### 4. Student Management Page 📷
![Course Management](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/Student%20Page)

### 5. Update Management page 📷
![Faculty Management](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/Update%20Teacher%20Details)

### 6. Leave Management page 📷
![Reporting](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/Apply%20Leave%20Page)

### 7. About Developer Page 📷
![About Developer Pae](https://github.com/amitkumardemo/University-Management-System/blob/main/Images/About%20Developer)

