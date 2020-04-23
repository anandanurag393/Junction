package com.omada.junction.data.clouddb;
import com.google.firebase.Timestamp;

import java.util.Map;

//note this class is just for getting the event specifications for the user
//add setters to this class for junction admin app
public class Event {

    private String event_name;
    private String event_description;
    private String event_organizer;
    private String event_poster;
    private Timestamp event_time_start;
    private Timestamp event_time_end;
    private String event_venue;
    private Integer users_registered;
    Map<String,String> event_organiser_cache;
    Map<String,String> event_venue_cache;

    public Event()
    {
        //public no_arg constructor needed for firestore to work;
    }

    public Event(String event_name, String event_description, String event_organizer,
                 String event_poster, Timestamp event_time_start, Timestamp event_time_end,
                 String event_venue, Integer users_registered, Map<String,String> event_organiser_cache,
                 Map<String,String> event_venue_cache)
    {

        this.event_name = event_name;
        this.event_description = event_description;
        this.event_organizer = event_organizer;
        this.event_poster = event_poster;
        this.event_time_start = event_time_start;
        this.event_time_end = event_time_end;
        this.event_venue = event_venue;
        this.users_registered = users_registered;
        this.event_organiser_cache = event_organiser_cache;
        this.event_venue_cache = event_venue_cache;

    }

    public String getEvent_name() {
        return event_name;
    }

    public String getEvent_description() {
        return event_description;
    }

    public String getEvent_organizer() {
        return event_organizer;
    }

    public String getEvent_poster() {
        return event_poster;
    }

    public Timestamp getEvent_time_start() {
        return event_time_start;
    }

    public Timestamp getEvent_time_end() {
        return event_time_end;
    }

    public String getEvent_venue() {
        return event_venue;
    }

    public Integer getUsers_registered() {
        return users_registered;
    }

    public Map<String, String> getEvent_organiser_cache() {
        return event_organiser_cache;
    }

    public Map<String, String> getEvent_venue_cache() {
        return event_venue_cache;
    }
}
