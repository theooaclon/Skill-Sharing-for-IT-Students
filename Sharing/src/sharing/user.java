/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sharing;

/**
 *
 * @author User
 */

import java.util.ArrayList;
public class user {
    private String studentid;
    private String name;
    private String username;
    private String password;
    private String schoolYear;
    
    private ArrayList<String> skills = new ArrayList<>();
    
    public user(String studentid, String name, String username, String password, String schoolYear) {
        this.studentid = studentid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.schoolYear = schoolYear;
    }
    
    public String getStudentId () {
        return studentid;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUsername () {
        return username;
    }
    
    public String getPassword () {
        return password;
    }
    
    public ArrayList<String> getSkills() {
        return skills;
    }
    
    public void addSkill (String skill) {
        skills.add(skill);
    }
    
    public void removeSkill(String skill) {
        skills.remove(skill);
    }
    
    public String getSchoolYear() {
        return schoolYear;
    }
 } 
