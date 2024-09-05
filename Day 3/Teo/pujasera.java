public class soal3 {
    // Kelas Kalulator dideklarasikan sebagai kelas statis
    static class Kalulator {
        public int hitungtambah(int nilai1, int nilai2) {
            return nilai1 + nilai2;
        }

        public int hitungkurang(int nilai1, int nilai2) {
            return nilai1 - nilai2;
        }

        public int hitungkali(int nilai1, int nilai2) {
            return nilai1 * nilai2;
        }

        public int hitungbagi(int nilai1, int nilai2) {
            return nilai1 / nilai2;
        }

        public int hitungbagisama(int nilai1, int nilai2) {
            return nilai1 % nilai2;
        }
    }

    public static void main(String[] args) {
        // Membuat objek Kalulator di dalam metode statis
        Kalulator KAL = new Kalulator();
        int magis = 10;
        int hagus = 5;

        // Menggunakan metode Kalulator
        System.out.println("Tambah: " + KAL.hitungtambah(magis, hagus));
        System.out.println("Kurang: " + KAL.hitungkurang(magis, hagus));
        System.out.println("Kali: " + KAL.hitungkali(magis, hagus));
        System.out.println("Bagi: " + KAL.hitungbagi(magis, hagus));
        System.out.println("Sisa bagi: " + KAL.hitungbagisama(magis, hagus));
    }
}
