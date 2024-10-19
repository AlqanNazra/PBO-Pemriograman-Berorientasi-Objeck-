import java.util.Arrays;

public class WeeklySales {
    public static void main(String[] args) {
        // Initialize array of salespeople
        Salesperson[] salesPeople = new Salesperson[6];
        
        // Create Salesperson objects with different sales and names
        salesPeople[0] = new Salesperson("John", "Doe", 300);
        salesPeople[1] = new Salesperson("Jane", "Smith", 300);
        salesPeople[2] = new Salesperson("Robert", "Brown", 200);
        salesPeople[3] = new Salesperson("Lucy", "Jones", 500);
        salesPeople[4] = new Salesperson("Mary", "Taylor", 300);
        salesPeople[5] = new Salesperson("Anna", "White", 500);

        // Sort using the compareTo method in the Salesperson class
        Arrays.sort(salesPeople);

        // Display the sorted list of salespeople
        System.out.println("Daftar sales person setelah diurutkan (penjualan terbanyak ke tersedikit):");
        for (Salesperson sp : salesPeople) {
            System.out.println(sp);
        }
    }
}
