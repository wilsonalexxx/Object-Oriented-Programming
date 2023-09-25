package com.example.ajaibmusicstudio.Object;

public abstract class Room {
    private String room_name, desc_room;
    private int img_room;

    public Room(String room_name, String desc_room, int img_room) {
        this.room_name = room_name;
        this.desc_room = desc_room;
        this.img_room = img_room;
    }

    public abstract String makeTrue();

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getDesc_room() {
        return desc_room;
    }

    public void setDesc_room(String desc_room) {
        this.desc_room = desc_room;
    }

    public int getImg_room() {
        return img_room;
    }

    public void setImg_room(int img_room) {
        this.img_room = img_room;
    }
}
