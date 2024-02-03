package com.nhs.tourbd;

public class model_event {

    String ev_title,ev_poster,ev_time, ev_details, ev_pic1, ev_pic2, ev_pic3;
    double ev_lat,ev_long;


    model_event()
    {

    }

    public model_event(String ev_title, String ev_poster, String ev_time, String ev_details, String ev_pic1, String ev_pic2, String ev_pic3, double ev_lat, double ev_long) {
        this.ev_title = ev_title;
        this.ev_poster = ev_poster;
        this.ev_time = ev_time;
        this.ev_details = ev_details;
        this.ev_pic1 = ev_pic1;
        this.ev_pic2 = ev_pic2;
        this.ev_pic3 = ev_pic3;
        this.ev_lat = ev_lat;
        this.ev_long = ev_long;
    }

    public String getEv_title() {
        return ev_title;
    }

    public void setEv_title(String ev_title) {
        this.ev_title = ev_title;
    }

    public String getEv_poster() {
        return ev_poster;
    }

    public void setEv_poster(String ev_poster) {
        this.ev_poster = ev_poster;
    }

    public String getEv_time() {
        return ev_time;
    }

    public void setEv_time(String ev_time) {
        this.ev_time = ev_time;
    }

    public String getEv_details() {
        return ev_details;
    }

    public void setEv_details(String ev_details) {
        this.ev_details = ev_details;
    }

    public String getEv_pic1() {
        return ev_pic1;
    }

    public void setEv_pic1(String ev_pic1) {
        this.ev_pic1 = ev_pic1;
    }

    public String getEv_pic2() {
        return ev_pic2;
    }

    public void setEv_pic2(String ev_pic2) {
        this.ev_pic2 = ev_pic2;
    }

    public String getEv_pic3() {
        return ev_pic3;
    }

    public void setEv_pic3(String ev_pic3) {
        this.ev_pic3 = ev_pic3;
    }

    public double getEv_lat() {
        return ev_lat;
    }

    public void setEv_lat(double ev_lat) {
        this.ev_lat = ev_lat;
    }

    public double getEv_long() {
        return ev_long;
    }

    public void setEv_long(double ev_long) {
        this.ev_long = ev_long;
    }
}