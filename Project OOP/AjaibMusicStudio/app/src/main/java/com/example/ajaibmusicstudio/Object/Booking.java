package com.example.ajaibmusicstudio.Object;

public class Booking {
    private int id_booking;
    private int id_customer;
    private String roomname;
    private String date;
    private String time;
    private String duration;
    private String statue;

    public Booking(int id_booking, int id_customer, String roomname, String date, String time, String duration, String statue) {
        this.id_booking = id_booking;
        this.id_customer = id_customer;
        this.roomname = roomname;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.statue = statue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_booking() {
        return id_booking;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }
}
