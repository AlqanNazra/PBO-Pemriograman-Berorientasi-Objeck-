/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
import 


public class Soal3 {  
    public static void main(String[] args) {
        // Membuat objek Product
        Product product = new Product("PS5", 150000, 10);

        // Membuat objek Sales dan mengoper objek Product
        Sales sales = new Sales(product);  // Pastikan 'Sales' diawali huruf kapital

        // Menjalankan metode-metode dalam Sales
        sales.sellProduct(5);
        sales.restockProduct(10);
        sales.updateProductPrice(100000000);

        // Output informasi produk
        System.out.println("Harga produk: " + product.getPrice());
        System.out.println("Nama produk: " + product.getProductName());
    }
}
