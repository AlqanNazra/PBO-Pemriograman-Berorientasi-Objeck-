import com.polban.jtk.inventory.Barang;
import com.polban.jtk.inventory.Inventori;
// package com.polban.jtk.inventory;


public class Soal2 
{
    public static void main(String[] args) {
        Barang barang = new Barang("001", "PS5", 5);
        Inventori beli = new Inventori();

        beli.showpengadaan(5);
        // System.err.println("Barang : " + barang.getNamaBarang());
        // System.err.println("stock : " + barang.getStok());

    } 
}

//     // Main method
//     public static void main(String[] args) {
//         Inventori beli = new Inventori();

//     }


