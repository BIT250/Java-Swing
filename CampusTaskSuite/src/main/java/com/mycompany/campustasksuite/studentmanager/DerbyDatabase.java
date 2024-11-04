/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campustasksuite.studentmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bogdan
 */
public class DerbyDatabase {
    private static final String DB_URL = "jdbc:derby://localhost:1527/student_db"; // Creates database if not exists

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); // Load Derby network driver
            conn = DriverManager.getConnection(DB_URL, "bituser", "admin");
            System.out.println("Connected to Derby database!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
        return conn;
    }
    
    
    public static void insertStudent(Student student) {
    String insertSQL = "INSERT INTO students (id, name, age, grade, department, academic_year) VALUES (?, ?, ?, ?, ?, ?)";
    
        System.out.println(student.id);

    try (Connection conn = DerbyDatabase.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

        // Set values from the Student object
        pstmt.setInt(1, student.getId());
        pstmt.setString(2, student.getName());
        pstmt.setInt(3, student.getAge());
        pstmt.setFloat(4, student.getGrade());
        pstmt.setString(5, student.getDepartment());
        pstmt.setInt(6, student.getYear());

        pstmt.executeUpdate();
        System.out.println("Student added successfully!");

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
    public static void deleteAllStudents() {
        String deleteSQL = "DELETE FROM students";

        try (Connection conn = DerbyDatabase.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Deleted " + rowsAffected + " students from the database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    public static List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<>();
        String selectSQL = "SELECT * FROM students";

        try (Connection conn = DerbyDatabase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int age = rs.getInt("AGE");
                float grade = rs.getFloat("GRADE");
                String department = rs.getString("DEPARTMENT");
                int year = rs.getInt("ACADEMIC_YEAR");

                // Create a Student object and add it to the list
                Student student = new Student(id, name, age, grade, department, year);
                students.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

}
