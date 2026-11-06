/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sharing;

/**
 *
 * @author User
 */

import javax.swing.JFrame;
public class Sharing {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        JFrame frame = new JFrame("Student Skill-Sharing System");

        loginform login = new loginform();

        frame.add(login);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
