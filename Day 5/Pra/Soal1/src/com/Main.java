package com;

public class Main {
    public static void main(String[] args) {
        // Creating instances of MK
        MK mk1 = new MK("ALIN", 'P', 101);
        MK mk2 = new MK("PBO", 'P', 102);
        MK mk3 = new MK("PBO", 'T', 103);
        MK mk4 = new MK("PBO", 'T', 104);
        MK mk5 = new MK("Matdis", 'T', 105);
        
        // Creating instances of Jadwal
        Jadwal jadwal1 = new Jadwal("Senin", "08:00-10:00");
        Jadwal jadwal2 = new Jadwal("Selasa", "10:00-12:00");
        Jadwal jadwal3 = new Jadwal("Rabu", "07:00-18:00");
        Jadwal jadwal4 = new Jadwal("Kamis", "17:00-11:00");
        Jadwal jadwal5 = new Jadwal("Jumat", "08:00-10:00");
        
        // Creating instances of Ruangan
        Ruangan ruangan1 = new Ruangan("R101", 17);
        Ruangan ruangan2 = new Ruangan("R102", 18);
        Ruangan ruangan3 = new Ruangan("R103", 19);
        Ruangan ruangan4 = new Ruangan("R104", 20);
        Ruangan ruangan5 = new Ruangan("R105", 21);
        // Creating instances of Mahasiswa
        String[] mahasiswaNama = {"Ali", "Budi", "Acit", "Bambang", "Endang", "Asep", "Luna", "Kula", "Sadewa", "Hujan"};
        String[] mahasiswaID = {"M001", "M002", "M003", "M004", "M005", "M006", "M007", "M008", "M009", "M010"};
        String[] mahasiswaNIM = {"60", "61", "62", "63", "64", "65", "66", "67", "68", "69"};
        String[] mahasiswaJurusan = {"Informatika", "Sistem Informasi", "Informatika", "Informatika", "Informatika", "Informatika", "Informatika", "Informatika", "Informatika", "Informatika"};        
        Mahasiswa mahasiswa = new Mahasiswa(mahasiswaNama, mahasiswaID, mahasiswaNIM, mahasiswaJurusan);
        
        // Creating instances of Dosen
        String[] dosenNama = {"Dr. Ahmad", "Dr. Siti", "Dr. Ayep","Dr. Dadang","Dr. Ahmad","Dr. YUsi","Dr. Babes","Dr. gaming","Dr. siri","Dr. saru"};
        String[] dosenID = {"D001", "D002","D003","D004","D005","D006","D007","D008","D009","D010"};
        String[] dosenNIP = {"NIP001", "NIP002","NIP003", "NIP004","NIP005", "NIP006","NIP007", "NIP008","NIP009", "NIP0010"};
        String[] dosenJurusan = {"Alin (P)", "PBO (P)","Alin (P)", "PBO (P)","Alin (T)", "PBO (T)","Matdis (T)", "Matdis (T)","Alin (P)", "DDP (P)"};
        Dosen dosen = new Dosen(dosenNama, dosenID, dosenNIP, dosenJurusan);
        
        // Display MK information
        System.out.println("MK Information:");
        System.out.println("MK 1: " + mk1.getMK() + ", Jenis: " + mk1.getjenis() + ", Kode MK: " + mk1.getkodeMK());
        System.out.println("MK 2: " + mk2.getMK() + ", Jenis: " + mk2.getjenis() + ", Kode MK: " + mk2.getkodeMK());
        System.out.println("MK 3: " + mk3.getMK() + ", Jenis: " + mk3.getjenis() + ", Kode MK: " + mk3.getkodeMK());
        System.out.println("MK 4: " + mk4.getMK() + ", Jenis: " + mk4.getjenis() + ", Kode MK: " + mk4.getkodeMK());
        System.out.println("MK 5: " + mk5.getMK() + ", Jenis: " + mk5.getjenis() + ", Kode MK: " + mk5.getkodeMK());
        
        // Display Jadwal information
        System.out.println("\nJadwal Information:");
        System.out.println("Jadwal 1: Hari: " + jadwal1.getHari() + ", Waktu: " + jadwal1.getWaktu());
        System.out.println("Jadwal 2: Hari: " + jadwal2.getHari() + ", Waktu: " + jadwal2.getWaktu());
        System.out.println("Jadwal 3: Hari: " + jadwal3.getHari() + ", Waktu: " + jadwal3.getWaktu());
        System.out.println("Jadwal 4: Hari: " + jadwal4.getHari() + ", Waktu: " + jadwal4.getWaktu());
        System.out.println("Jadwal 5: Hari: " + jadwal5.getHari() + ", Waktu: " + jadwal5.getWaktu());
        // Display Ruangan information
        System.out.println("\nRuangan Information:");
        System.out.println("Ruangan 1: " + ruangan1.getruangan() + ", Kode Ruangan: " + ruangan1.getkoderuangan());
        System.out.println("Ruangan 2: " + ruangan2.getruangan() + ", Kode Ruangan: " + ruangan2.getkoderuangan());
        System.out.println("Ruangan 3: " + ruangan3.getruangan() + ", Kode Ruangan: " + ruangan3.getkoderuangan());
        System.out.println("Ruangan 4: " + ruangan4.getruangan() + ", Kode Ruangan: " + ruangan4.getkoderuangan());
        System.out.println("Ruangan 5: " + ruangan5.getruangan() + ", Kode Ruangan: " + ruangan5.getkoderuangan());
        
        // Display Mahasiswa information
        System.out.println("\nMahasiswa Information:");
        for (int i = 0; i < mahasiswa.getNIM().length; i++) {
            System.out.println("Nama: " + mahasiswa.getnama()[i] + " NIM: " + mahasiswa.getNIM()[i] + " Jurusan: " + mahasiswa.getjurusan()[i]);
            //                                      ^^^^^^
            //                                     Menggunakan.getnama dari person 
        }
        
        // Display Dosen information
        System.out.println("\nDosen Information:");
        for (int i = 0; i < dosen.getNIP().length; i++) {
            System.out.println("Nama: " + dosen.getnama()[i] + " NIP: " + dosen.getNIP()[i] + " Jurusan: " + dosen.getjurusan()[i]);
        //                                      ^^^^^^
        //                            Menggunakan.getnama dari person 
        }
    }
}
