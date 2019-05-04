package com.idea.idc.myselfapps.model;

public class DailyModel {
    private String nama;
    private String waktu;

    public DailyModel(String nama, String waktu) {
        this.nama = nama;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
