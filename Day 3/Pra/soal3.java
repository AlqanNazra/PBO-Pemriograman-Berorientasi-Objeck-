import java.util.Scanner;

public class soal3
 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            
        Scanner scanner = new Scanner(System.in);
        System.err.println("Masukkan nilai A: ");
        int A = scanner.nextInt();
        System.err.println("Masukkan proses matematika (+,-,*,/,%): ");
        char operator = scanner.next().charAt(0);
        System.err.println("Masukkan Nilai B: ");
        int B = scanner.nextInt();

        int hasil = 0;
        switch (operator) {
            case '+':
                hasil = A + B;
                break;
            case '-':
                hasil = A - B;
                break;
            case '*':
                hasil = A * B;
                break;
            case '/':
                hasil = A / B;
                break;
            case '%':
                hasil = A % B;
                break;
        }
        System.out.println(hasil + "\n");
    }
        
    }
}