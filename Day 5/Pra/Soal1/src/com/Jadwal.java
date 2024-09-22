package com;

public class Jadwal {
    private String Hari;
    private String Waktu;

    public Jadwal(String Hari, String Waktu) {
        this.Hari = Hari;
        this.Waktu = Waktu;
    }

    public String getHari() {
        return Hari;
    }

    public void setHari(String Hari) {
        this.Hari = Hari;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String Waktu) {
        this.Waktu = Waktu;
    }
}
