package com.nhs.tourbd;

public class model_popupar_place {

    String lat,l_ong,place_title, place_details, place_pic1, place_pic2, place_pic3, place_pic4, place_pic5;

    model_popupar_place()
    {

    }

    public model_popupar_place(String lat, String l_ong, String place_title, String place_details, String place_pic1, String place_pic2, String place_pic3, String place_pic4, String place_pic5) {
        this.lat = lat;
        this.l_ong = l_ong;
        this.place_title = place_title;
        this.place_details = place_details;
        this.place_pic1 = place_pic1;
        this.place_pic2 = place_pic2;
        this.place_pic3 = place_pic3;
        this.place_pic4 = place_pic4;
        this.place_pic5 = place_pic5;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getL_ong() {
        return l_ong;
    }

    public void setL_ong(String l_ong) {
        this.l_ong = l_ong;
    }

    public String getPlace_title() {
        return place_title;
    }

    public void setPlace_title(String place_title) {
        this.place_title = place_title;
    }

    public String getPlace_details() {
        return place_details;
    }

    public void setPlace_details(String place_details) {
        this.place_details = place_details;
    }

    public String getPlace_pic1() {
        return place_pic1;
    }

    public void setPlace_pic1(String place_pic1) {
        this.place_pic1 = place_pic1;
    }

    public String getPlace_pic2() {
        return place_pic2;
    }

    public void setPlace_pic2(String place_pic2) {
        this.place_pic2 = place_pic2;
    }

    public String getPlace_pic3() {
        return place_pic3;
    }

    public void setPlace_pic3(String place_pic3) {
        this.place_pic3 = place_pic3;
    }

    public String getPlace_pic4() {
        return place_pic4;
    }

    public void setPlace_pic4(String place_pic4) {
        this.place_pic4 = place_pic4;
    }

    public String getPlace_pic5() {
        return place_pic5;
    }

    public void setPlace_pic5(String place_pic5) {
        this.place_pic5 = place_pic5;
    }
}
