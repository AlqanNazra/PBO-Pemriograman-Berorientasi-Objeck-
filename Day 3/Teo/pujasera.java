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
        Menu menu = new Menu();

        menu.setBarang("Nasi Goreng");
        menu.setHarga(15000);
        menu.setJumlah(2);

        menu.cetakMenu();
    }
}
