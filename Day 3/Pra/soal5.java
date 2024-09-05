import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] platNumbers = scanner.nextLine().split(" ");

        int sum = 0;
        for (String platNumber : platNumbers) {
            // Extract the numerical part of the plat number
            String numericalPart = platNumber.replaceAll("[^0-9]", "");
            if (!numericalPart.isEmpty()) {
                sum += Integer.parseInt(numericalPart);
            }
        }

        int result = (sum % 1000000 - 999999) % 5;
        if (result == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}