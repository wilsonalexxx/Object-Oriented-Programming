package com.example.ajaibmusicstudio.Object;

public class Customer extends User{
    private int id_customer;
    public Customer(int id_customer,String firstName, String lastName, String email, String username, String password) {
        super(firstName, lastName, email, username, password);
        this.id_customer = id_customer;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }
}
