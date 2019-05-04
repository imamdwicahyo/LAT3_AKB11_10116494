package com.idea.idc.myselfapps.model;

public class GaleryModel {

    private String nama;
    private int image_file;

    public GaleryModel(String nama, int image_file) {
        this.nama = nama;
        this.image_file = image_file;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getImage_file() {
        return image_file;
    }

    public void setImage_file(int image_file) {
        this.image_file = image_file;
    }
}
