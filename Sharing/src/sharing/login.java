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
public class login {
    public static user Logins(String username, String password) {
        username = username.trim();
        
        String sql = "SELECT * FROM Student WHERE Username = ? AND Password = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new user(
                    rs.getString("StudentID"),
                    rs.getString("Name"),
                    rs.getString("Username"),
                    rs.getString("Password"),
                    rs.getString("SchoolYear")
                );
            }

        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
        }

        return null;
    }
    
    
    
}
