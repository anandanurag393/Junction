package com.omada.junction.data.clouddb;

import java.util.List;

public class User {

    private Integer attended_events_number;
    private String user_branch;
    private String user_name;
    private String user_password;
    private String user_phone;
    private String profile_photo;
    private Integer won_events_number;
    List<String> events_attended;
    List<String> user_interested;

    public User() {
        //no arg constructor needed for firestore;
    }

    public User(Integer attended_events_number, String user_branch,
                String user_name, String user_password, String user_phone,
                String profile_photo, Integer won_events_number,
                List<String> events_attended, List<String> user_interested) {
        this.attended_events_number = attended_events_number;
        this.user_branch = user_branch;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.profile_photo = profile_photo;
        this.won_events_number = won_events_number;
        this.events_attended = events_attended;
        this.user_interested = user_interested;
    }

    public Integer getAttended_events_number() {
        return attended_events_number;
    }

    public String getUser_branch() {
        return user_branch;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public Integer getWon_events_number() {
        return won_events_number;
    }

    public List<String> getEvents_attended() {
        return events_attended;
    }

    public List<String> getUser_interested() {
        return user_interested;
    }
}
