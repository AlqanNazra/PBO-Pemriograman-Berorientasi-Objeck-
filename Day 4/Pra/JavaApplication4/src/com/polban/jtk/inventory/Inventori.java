package com.polban.jtk.inventory;

public class Inventori {
    private Barang[] barangs;

    // Inisialisasi barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }


    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + " (" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + " (" + barangs[1].getStok() + ")");
    }


    void pengadaan(int nilaistock) {
        initBarang();
        barangs[0].tambahStok(nilaistock); // Menambah stok
        // barangs[0].stok -= 30; // Tidak diperbolehkan
        // barangs[0].stok *= 30; // Tidak diperbolehkan

        showBarang();
    }

    public int showpengadaan(int nilaistock) {
        pengadaan(nilaistock); // Call pengadaan, but no need to return anything
        return barangs[0].getStok(); // Example: return the updated stock for the first item
    }

    
}