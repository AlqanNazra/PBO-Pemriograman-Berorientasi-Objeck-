import java.util.Scanner;


//Soal 3

class Stringsort {
// Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    public static void main(String[] args) {
        String[] SrList; // Array untuk menyimpan string
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        SrList = new String[size]; 
        System.out.println("\nEnter the strings...");
        scan.nextLine(); 
        for (int i = 0; i < size; i++) {
            SrList[i] = scan.nextLine(); 
        }
        
        Sorting.selectionSort(SrList);
        // Sorting.selectionSort(SrList);

        // Chapter 9: Polymorphism
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(SrList[i] + " ");
        }
        System.out.println();
        
        scan.close(); 
    }
}
