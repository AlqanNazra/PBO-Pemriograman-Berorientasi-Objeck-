public class Soal3{
    //beres 05.07
    public static void main(String[] args) {
    double x = 92.5; 
    int nx = (int) Math.round(x);
    System.err.println(nx);
    }
   }


import com.polban.jtk.sales.Product;
   /*Pada program ini merupakan fungsi dari Math yang memiliki fungsi 
    * untuk dapat membuat Nilai dari tipe data Double dan float dapat 
    diibulatkan.

   Jawaban No.1
   NX pada progaram ini digunakan untuk menyimpan nilai dari proses math.round 
   sebelum dimasukkan nilainya nilai nx ini merupakan nilai yang tidak diketahui
   setelah digunakan Math.roud maka nilai dari variabel double x yang sudah 
   melewati proses dari Math.round ini akan disimpan dimana hasil dari porsesini
   adalah 93

   JAWABAN No.2
   Kenapa dibutuhkan Cas(int) ini dikarenakan sifat dari tipe data nx itu sendiri 
   bertipe integer bili kita masukkan tipe data selain int ini maka akan terjadi error
   selain itu bila kita memasukkan tipe data float dan double maka akan tidak sesaui 
   dikarenakan dipertuntukan untuk nilai pecahan dan desimal bila menggunakan byte
   maka nilai terlalu kecil tidak dapat menampung data yang besar bila Long maka
   akan terlalu boros memori maka tipe data yang cocok ada dua short interger dan 
   interger karena cocok dengan operasi ini kecuali data dimasukkan jutaan maka 
   menggunakan long serta intinya tipe data integer merupakan tipe data untuk 
   menyimpan bilangan bulat
    */
   