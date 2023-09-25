package com.example.ajaibmusicstudio.Object;

public class Admin extends User{
    private int id_admin;

    public Admin(int id_admin,String firstName, String lastName, String email, String username, String password) {
        super(firstName, lastName, email, username, password);
        this.id_admin = id_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public static String Gift_OnGoingStatus(){
        return "OnGoing";
    }

    public static String Gift_CancelStatus(){
        return "Cancel";
    }

    public static String Gift_FinishStatus(){
        return "Finish";
    }
}
