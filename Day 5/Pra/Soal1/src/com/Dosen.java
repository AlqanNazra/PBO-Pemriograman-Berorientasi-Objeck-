package com;

public class Dosen extends Person {
    private String[] NIP;
    private String[] jurusan;

    public Dosen(String[] nama, String[] id, String[] NIP,String[] jurusan) {
        super(nama, id);
        this.NIP = NIP;
        this.jurusan = jurusan;
    }

    public String[] getNIP() {
        return NIP;
    }

    public void setNIP(String[] NIP) {
        this.NIP = NIP;
    }

    public String[] getjurusan(){
        return  jurusan;
    }

    public void setjurusan(String[] jurusan)
    {
        this.jurusan = jurusan;
    }
}
