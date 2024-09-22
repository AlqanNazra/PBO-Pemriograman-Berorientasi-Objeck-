package com;

public class Mahasiswa extends Person{
    private String[] NIM;
    private String[] jurusan;

    public Mahasiswa(String[] nama, String[] id, String[] NIM,String[] jurusan) {
        super(nama, id);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String[] getNIM() {
        return NIM;
    }

    public void setNIM(String[] NIM) {
        this.NIM = NIM;
    }

    public String[] getjurusan(){
        return  jurusan;
    }

    public void setjurusan(String[] jurusan)
    {
        this.jurusan = jurusan;
    }
}
