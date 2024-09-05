import java.util.Scanner;

public class soal4 {
     // paham 05.16
     // tipe data  | range     | bit
     // byte         128 - 127 | 8 bit
     // short         -32,768 - 32,767 | 16 bit
     // int        | 

 static short methodOne(long l)
 {
 int i = (int) l;
 return (short)i; 
 }
 public static void main(String[] args)
 {
 double d = 10.25;
 float f = (float) d; 
 byte b = (byte) methodOne((long) f); 
 System.out.println(b);
 }
}

/*Pada program ini merupakan program melakukan konversi tipe data 
 * yang dengan kebutuhan byte dimana pada program ini kebutuhan byte yang 
 * yang dimulai dari byete besar ke kecil
 * 
 * 
 * Jawaban 1
 * Pada nilai variabel B ini merupakan nilai konversi hasil dari d dimana
 * pada program ini terjadi banyak perubahan tipe data dengan tujuan untuk 
 * efisiensi memori, hasil dari nilai b ini merupakah hasil dari proses konversi
 * f yang berawal float menjadi short integer lalu dikonverikan kembali menjadi byte
 * 
 * Jawaban 2
 * Pada Perubahan yang terjadi pada d dimulai dari tipe data double d dimana nilai variabel d ini
 * akan dikonversikan menjadi float yang dimana nilainya disimpan ke f,lalu nilai dari f ini dimmasukkan 
 * pada fungsi methodOne dimana f ini diubah tipe datanya menjadi long dimana long l ini akan 
 * diubah menjadi int yang nilainnya disimpan pada i sebelum dikembalikannya nilai i akan diubah menjadi
 * short lalu i dokonversikan lagi menjadi tipe data byte yang dimana nialai byte ini disimpan pada
 * variabel b.
 */
 
