package com;

public class MK {
    private String MK;
    private char jenis;
    private int kodeMK;

    public MK(String MK,char jenis,int kodeMK){
        this.MK = MK;
        this.jenis = jenis;
        this.kodeMK = kodeMK;
    }

    public char getjenis(){
        return jenis;
    }

    public void setjenis(char jenis){
        this.jenis = jenis;
    }

    public String getMK(){
        return MK;
    }

    public void setMK(String MK){
        this.MK = MK;
    }

    public int getkodeMK(){
        return kodeMK;
    }

    public void setkodeMK(int kodeMK){
        this.kodeMK = kodeMK;
    }

}
