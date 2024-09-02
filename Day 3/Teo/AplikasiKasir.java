// Kelas Barang untuk menyimpan informasi tentang barang
class Barang {
    private String nama;
    private double harga;
    private int jumlah;

    // Konstruktor
    public Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Getter untuk jumlah
    public int getJumlah() {
        return jumlah;
    }

    // Setter untuk jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Metode untuk menghitung total harga barang
    public double hitungTotal() {
        return harga * jumlah;
    }
}

// Kelas Kasir untuk mengelola transaksi
class Kasir {
    private List<Barang> daftarBelanja;

    // Konstruktor
    public Kasir() {
        daftarBelanja = new ArrayList<>();
    }

    // Metode untuk menambahkan barang ke daftar belanja
    public void tambahBarang(Barang barang) {
        daftarBelanja.add(barang);
    }

    // Metode untuk menghitung total pembayaran
    public double hitungTotalBayar() {
        double total = 0;
        for (Barang barang : daftarBelanja) {
            total += barang.hitungTotal();
        }
        return total;
    }

    // Metode untuk mencetak struk belanja
    public void cetakStruk() {
        System.out.println("Struk Belanja:");
        for (Barang barang : daftarBelanja) {
            System.out.println(barang.getNama() + " - " + barang.getJumlah() + " x " + barang.getHarga() + " = " + barang.hitungTotal());
        }
        System.out.println("Total Bayar: " + hitungTotalBayar());
    }
}

// Kelas utama
public class AplikasiKasir {
    public static void main(String[] args) {
        // Membuat objek Kasir
        Kasir kasir = new Kasir();

        // Menambahkan beberapa barang ke dalam daftar belanja
        kasir.tambahBarang(new Barang("Roti", 15000, 2));
        kasir.tambahBarang(new Barang("Susu", 25000, 1));
        kasir.tambahBarang(new Barang("Teh", 10000, 3));

        // Mencetak struk belanja
        kasir.cetakStruk();
    }
}
