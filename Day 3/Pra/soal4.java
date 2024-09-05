import java.util.Scanner;

class Item {
    public float hitung(int item) {
        return 0.10f * item * 50000; // 10% bonus for each item
    }
}

public class soal4 {
    public static void main(String[] args) {
        Item itemBonus = new Item();
        Scanner scanner = new Scanner(System.in);
        int gajiPokok = 500000;
        float hargaItem = 50000;

        System.out.print("Nilai item: ");
        int item = scanner.nextInt();  

        float totalPenjualan = item * hargaItem;
        float bonusItem = itemBonus.hitung(item);

        float totalGaji;
        if (item >= 80) {
            totalGaji = totalPenjualan * 0.35f; 
        } else if (item >= 40) {
            totalGaji = totalPenjualan * 0.25f; 
        } else if (item < 15) {
            totalGaji = -totalPenjualan * 0.15f; 
        } else {
            totalGaji = 0;
        }

        float hasil = gajiPokok + totalGaji + bonusItem;
        System.out.println("Nilai Akhir = " + (int) Math.round(hasil));
    }
}