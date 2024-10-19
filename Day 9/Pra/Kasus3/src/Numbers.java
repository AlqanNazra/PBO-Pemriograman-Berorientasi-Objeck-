// *
// Numbers.java
// Demonstrates selectionsort on an array of integers.
// ********
// *******
// **
// ********
import java.util.Scanner;


// Soal 2 & soal 1
public class Numbers
{
    //
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    //
    public static void main (String[] args)
    {
        Integer [] intList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer [size];
        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList [i] = scan.nextInt();
        Sorting.insertionSort(intList); // Soal 4
        // Sorting.selectionSort(intList);

        // Chapter 9: Polymorphism
        System.out.println ("\nYour numbers in sorted order...");
        for (int i=0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}