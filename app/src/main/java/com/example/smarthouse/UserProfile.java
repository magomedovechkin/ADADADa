package com.example.smarthouse;

public class UserProfile {

    String username, email, phone, gender;
    int date;

    public UserProfile(String username, String email, String phone, String gender, int date) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.date = date;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
