// **************************************************************** 
// ParseInts.java 
// 
// Reads a line of text and prints the integers in the line. 
// 
// **************************************************************** 
import java.util.Scanner; 
public class ParseInts{ 
public static void main(String[] args){ 
int val, sum=0; 
Scanner scan = new Scanner(System.in); 
String line; 
 
System.out.println("Enter a line of text"); 
Scanner scanLine = new Scanner(scan.nextLine()); 

while (scanLine.hasNext()){ 
String token = scanLine.next();
try
{
    val = Integer.parseInt(token); 
    sum += val;
}
catch (NumberFormatException e)
{  
    System.err.println("Bukan integer : "+token);
}
 
} 
System.out.println("The sum of the integers on this line is " + sum); 
} 
} 
 
  
