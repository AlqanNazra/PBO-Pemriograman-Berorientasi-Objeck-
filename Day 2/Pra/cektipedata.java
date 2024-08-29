import java.util.Scanner;
/*Pada code ini merupakan proses dari looping dimana proses looping terdapat controlflow yang akan menampilkan iput T dimana 
 * T ini menjadi sebuah Varibael yang akan melakukan pengecekan apakah nilai dari T ini dapat nilai range bitnya memenuhi range
 * dari tipe data yang dibutuhkan 
 */

public class cektipedata{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String T;
        for (int i = 0; i <= 6;i++)
        {
            System.out.print("Nilai T: ");
            T = scanner.nextLine();
            
            long N = Long.parseLong(T);
            if(N >= Byte.MIN_VALUE && N <= Byte.MAX_VALUE)
            {
                System.out.println("byte");
            }
            if(N >= Short.MIN_VALUE && N <= Short.MAX_VALUE)
            {
                System.out.println("Short");
            }
            if (N >=  Integer.MIN_VALUE && N <= Integer.MAX_VALUE)
            {
                System.out.println("int");
            }
            if (N >= Long.MIN_VALUE && N <= Long.MAX_VALUE)
            {
                System.out.println("Long");
            }
            else
            {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
/*Dibantu Oleh Rifqi Irfansyah */