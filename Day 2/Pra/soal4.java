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
 */
 
