/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sharing;

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class register {
    public static String registeruser (String studentid, String name, String username, String password, String confirmpassword, String schoolYear) {
    studentid = studentid.trim();
    name = name.trim();
    username = username.trim();
    
    if(studentid.isEmpty()) {
        return "please enter your student ID";
    }
    
    if (!studentid.matches("\\d+")) {
        return "Student ID must contain numbers only";
    }
    
    if(name.isEmpty()) {
        return "please enter your name";
    }
    
    if(username.isEmpty()) {
        return "please enter a username";
    }
    
    if(schoolYear == null || schoolYear.equals("Select Year Level")) {
        return "please select your year level";
    }
    
    if(password.isEmpty()) {
        return "please enter a password";
    }
    
    if(confirmpassword.isEmpty()) {
        return "please confirm your password";
    }
    
    if(password.length() < 5) {
        return "password must be atleast 6 characters";
    }
    
    if(!password.equals(confirmpassword)) {
        return "password do not match";
    }
    
    String checkSql = "SELECT * FROM Student WHERE Username = ? OR StudentID = ?";
    String insertSql = "INSERT INTO Student (StudentID, Name, Username, Password, SchoolYear) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {

            try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                checkStmt.setString(1, username);
                checkStmt.setString(2, studentid);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()) {
                    return "username or student ID already exists";
                }
            }

            try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                insertStmt.setString(1, studentid);
                insertStmt.setString(2, name);
                insertStmt.setString(3, username);
                insertStmt.setString(4, password);
                insertStmt.setString(5, schoolYear);
                insertStmt.executeUpdate();
            }

            return "registered sucessfully!";

        } catch (SQLException e) {
            return "database error: " + e.getMessage();
        }
    }
}
