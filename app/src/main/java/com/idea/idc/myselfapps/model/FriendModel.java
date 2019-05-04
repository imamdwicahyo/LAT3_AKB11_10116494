package com.idea.idc.myselfapps.model;

public class FriendModel {

    String teman, phone;

    public FriendModel(String nama, String phone) {
        this.teman = nama;
        this.phone = phone;
    }

    public String getTeman() {
        return teman;
    }

    public void setTeman(String nama) {
        this.teman = nama;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
