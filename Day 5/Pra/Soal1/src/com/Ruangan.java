package com;

public class Ruangan {
    private String ruangan;
    private int koderuangan;

    public Ruangan(String ruangan,int koderuangan){
        this.ruangan = ruangan;

        this.koderuangan = koderuangan;
    }

    public String getruangan(){
        return ruangan;
    }

    public void setruangan(String ruangan){
        this.ruangan = ruangan;
    }

    public int getkoderuangan(){
        return koderuangan;
    }

    public void setkoderuangan(int koderuangan){
        this.koderuangan = koderuangan;
    }

}
