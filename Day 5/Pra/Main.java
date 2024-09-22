import  Soal1.Soal1.src.com.Ruangan;

public class Main {
    public static void main(String[] args) {
        // Creating instances of MK
        MK mk1 = new MK("Matematika", 'A', 101);
        MK mk2 = new MK("Fisika", 'B', 102);
        
        // Creating instances of Jadwal
        Jadwal jadwal1 = new Jadwal("Senin", "08:00-10:00");
        Jadwal jadwal2 = new Jadwal("Selasa", "10:00-12:00");
        
        // Creating instances of Ruangan
        Ruangan ruangan1 = new Ruangan("Ruang 101", 201);
        Ruangan ruangan2 = new Ruangan("Ruang 102", 202);
        
        // Creating instances of Mahasiswa
        String[] mahasiswaNama = {"Ali", "Budi"};
        String[] mahasiswaID = {"M001", "M002"};
        String[] mahasiswaNIM = {"NIM001", "NIM002"};
        String[] mahasiswaJurusan = {"Teknik", "Sistem Informasi"};
        Mahasiswa mahasiswa = new Mahasiswa(mahasiswaNama, mahasiswaID, mahasiswaNIM, mahasiswaJurusan);
        
        // Creating instances of Dosen
        String[] dosenNama = {"Dr. Ahmad", "Dr. Siti"};
        String[] dosenID = {"D001", "D002"};
        String[] dosenNIP = {"NIP001", "NIP002"};
        String[] dosenJurusan = {"Matematika", "Fisika"};
        Dosen dosen = new Dosen(dosenNama, dosenID, dosenNIP, dosenJurusan);
        
        // Display MK information
        System.out.println("MK Information:");
        System.out.println("MK 1: " + mk1.getMK() + ", Jenis: " + mk1.getjenis() + ", Kode MK: " + mk1.getkodeMK());
        System.out.println("MK 2: " + mk2.getMK() + ", Jenis: " + mk2.getjenis() + ", Kode MK: " + mk2.getkodeMK());
        
        // Display Jadwal information
        System.out.println("\nJadwal Information:");
        System.out.println("Jadwal 1: Hari: " + jadwal1.getHari() + ", Waktu: " + jadwal1.getWaktu());
        System.out.println("Jadwal 2: Hari: " + jadwal2.getHari() + ", Waktu: " + jadwal2.getWaktu());
        
        // Display Ruangan information
        System.out.println("\nRuangan Information:");
        System.out.println("Ruangan 1: " + ruangan1.getruangan() + ", Kode Ruangan: " + ruangan1.getkoderuangan());
        System.out.println("Ruangan 2: " + ruangan2.getruangan() + ", Kode Ruangan: " + ruangan2.getkoderuangan());
        
        // Display Mahasiswa information
        System.out.println("\nMahasiswa Information:");
        for (int i = 0; i < mahasiswa.getNIM().length; i++) {
            System.out.println("Nama: " + mahasiswa.getNIM()[i] + ", Jurusan: " + mahasiswa.getjurusan()[i]);
        }
        
        // Display Dosen information
        System.out.println("\nDosen Information:");
        for (int i = 0; i < dosen.getNIP().length; i++) {
            System.out.println("Nama: " + dosen.getNIP()[i] + ", Jurusan: " + dosen.getjurusan()[i]);
        }
    }
}
