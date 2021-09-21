package com.example.youthpesa;

public class Customers {
    public String Username;
    public String Email;
    public String Phone_Number;


    public Customers() {
    }

    public String getUsername(){
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public Customers(String username, String email, String phone_number){
        Username = username;
        Email = email;
        Phone_Number = phone_number;
    }




}
