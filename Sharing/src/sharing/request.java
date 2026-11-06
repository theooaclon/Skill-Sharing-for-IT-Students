/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sharing;

/**
 *
 * @author NINGMEI®
 */
public class request {
    private user requester;
    private user helper;
    private String skill;
    private String status;
    private String notes = "";
    private java.util.Date dateRequested;
    private String meetupdate = "";
    private String meetuptime = "";
    
    public request(user requester, user helper, String skill, String status) {
        this.requester = requester;
        this.helper = helper;
        this.skill = skill;
        this.status = status;
        this.dateRequested = new java.util.Date();
    }
    
    public user getRequester() {
        return requester;
    }
    public user getHelper() {
        return helper;
    }

    public String getSkill() {
        return skill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String getMeetupDate() {
        return meetupdate;
    }
    
    public void setMeetupDate(String meetupdate) {
        this.meetupdate = meetupdate;
    }
    
    public String getMeetupTime() {
        return meetuptime;
    }
    public void setMeetupTime(String meetuptime) {
        this.meetuptime = meetuptime;
    }
    public String getDateRequested() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("M/d/yyyy");
        return sdf.format(dateRequested);
    }
    
}
