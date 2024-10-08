package com.polban.jtk.inventory;


public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Konstruktor
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }

    // Getter untuk nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Metode untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        }
    }
}