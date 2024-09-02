import java.util.Scanner;

class Menu {
    private String barang;  // String harus dengan huruf kapital
    private int jumlah;
    private int harga;
    
    // Setter untuk barang
    public void setBarang(String isibarang) {
        barang = isibarang;
    }

    // Setter untuk harga
    public void setHarga(int isiharga) {
        harga = isiharga;
    }

    // Getter untuk barang
    public String getBarang() {
        return barang;
    }

    // Getter untuk jumlah
    public int getJumlah() {
        return jumlah;
    }

    // Setter untuk jumlah
    public void setJumlah(int setjumlah) {
        jumlah = setjumlah;
    }

    // Getter untuk harga
    public int getHarga() {
        return harga;
    }

    // Metode untuk menghitung total harga
    public int hitungTotal(int jumlah, int harga) {
        return harga * jumlah;
    }

    // Metode untuk mencetak menu
    public void cetakMenu() {
        System.out.println("Menu Pujasera");
        System.out.println(getBarang() + " - " + getJumlah() + " porsi - Harga: " + getHarga() + " Total = " + hitungTotal(getJumlah(), getHarga()));
    }
}

public class pujasera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("1. Nasi Goreng          | Harga : 15.000");
        System.out.println("2. Mie Goreng           | Harga : 15.000");
        System.out.println("3. Bihun Goreng         | Harga : 20.000");
        System.out.println("4. Nasi Goreng Spesial  | Harga : 30.000");
        System.out.println("5. Nasi Goreng Seafood  | Harga : 25.000");
        System.out.println("6. Mie Goreng Spesial   | Harga : 30.000");
        System.out.println("7. Mie Goreng Seafood   | Harga : 25.000");
        System.out.println("8. Bihun Goreng Spesial | Harga : 30.000");
        System.out.println("9. Bihun Goreng Seafood | Harga : 30.000");
        System.out.println("10. Kol Gorang          | Harga : 3.000");
        System.err.println("Masukkan Pilihan Menu");
        int pilihan = scanner.nextInt();
        System.out.print("Jumlah makanan: ");
        int jumlah_order = scanner.nextInt(); 
        menu.setJumlah(jumlah_order);


        switch (pilihan) {
            case 1:
                menu.setBarang("Nasi Goreng");
                menu.setHarga(15000);
                menu.cetakMenu();
                break;
            case 2:
                menu.setBarang("Mie Goreng");
                menu.setHarga(15000);
                menu.cetakMenu();
                break;
            case 3:
            menu.setBarang("Bihun Goreng");
            menu.setHarga(20000);
            menu.cetakMenu();
                break;
            case 4:
            menu.setBarang("Nasi Goreng Spesial");
            menu.setHarga(30000);
            menu.cetakMenu();
                break;
            case 5:
            menu.setBarang("Nasi Goreng Seafood");
            menu.setHarga(25000);
            menu.cetakMenu();
                break;
            case 6:
            menu.setBarang("Mie Goreng Spesial");
            menu.setHarga(30000);
            menu.cetakMenu();
                break;
            case 7:
            menu.setBarang("Mie Goreng Seafood");
            menu.setHarga(25000);
            menu.cetakMenu();
                break;
            case 8:
            menu.setBarang("Bihun Goreng Spesial");
            menu.setHarga(30000);
            menu.cetakMenu();
                break;
            case 9:
            menu.setBarang("Bihun Goreng Seafood");
            menu.setHarga(25000);
            menu.cetakMenu();
                break;
            case 10:
            menu.setBarang("Kol Goreng");
            menu.setHarga(3000);
            menu.cetakMenu();
                break;
            default:
                System.out.println("Nomor menu tidak valid");
                break;
            
        }
    }
}
    

