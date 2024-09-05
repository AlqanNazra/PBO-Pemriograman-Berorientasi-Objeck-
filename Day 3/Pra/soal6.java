import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine().trim(); 
        String b = scanner.nextLine().trim(); 
        
        // Check if either string is empty
        if (a.isEmpty() || b.isEmpty()) {
            System.err.println("ERROR: Input cannot be empty");
            return;
        }
        
        try {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            

            BigInteger Tambah = bigA.add(bigB);
            BigInteger Kali = bigA.multiply(bigB);
            
            // Output the results
            System.out.println(Tambah);
            System.out.println(Kali);
        } catch (NumberFormatException e) {
            System.err.println("ERROR: Invalid input format");
        }
    }
}
