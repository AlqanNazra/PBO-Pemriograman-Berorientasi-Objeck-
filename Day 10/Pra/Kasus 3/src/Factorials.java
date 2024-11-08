 
// **************************************************************** 
// Factorials.java 
// Reads integers from the user and prints the factorial of each. 
// 
// **************************************************************** 
import java.util.Scanner; 
public class Factorials{ 
    public static void main(String[] args){ 
        String keepGoing = "y"; // Ganti tanda kutip miring dengan tanda kutip biasa
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: "); 
            int val = scan.nextInt();  
            try {
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val)); 
            } catch (IllegalStateException e) {
                System.err.println("Error: " + e.getMessage());
            }
            System.out.print("Another factorial? (y/n) "); 
            keepGoing = scan.next(); 
        } 
    } 
} 
 