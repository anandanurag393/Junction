package com.omada.junction.data.clouddb;

import java.util.List;

public class Club {

    private Integer held_event_number;
    private Integer attended_users_number;
    private  String organisation_profile_photo;
    private String  organization_name;
    private String organization_type;
    List<String> events_held;
    List<String> organisation_interests;

    public Club() {
        //no arg constructor for firestore
    }

    public Club(Integer held_event_number, Integer attended_users_number,
                String organisation_profile_photo, String organization_name,
                String organization_type, List<String> events_held,
                List<String> organisation_interests) {
        this.held_event_number = held_event_number;
        this.attended_users_number = attended_users_number;
        this.organisation_profile_photo = organisation_profile_photo;
        this.organization_name = organization_name;
        this.organization_type = organization_type;
        this.events_held = events_held;
        this.organisation_interests = organisation_interests;
    }

    public Integer getHeld_event_number() {
        return held_event_number;
    }

    public Integer getAttended_users_number() {
        return attended_users_number;
    }

    public String getOrganisation_profile_photo() {
        return organisation_profile_photo;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public String getOrganization_type() {
        return organization_type;
    }

    public List<String> getEvents_held() {
        return events_held;
    }

    public List<String> getOrganisation_interests() {
        return organisation_interests;
    }
}
