
import java.util.Scanner;
public class tugas1
{
    
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    float hasil = 0;
    int n = 5;

    for (int i = 0; i < n ; n++)
    {
        System.out.print("Nilai Tugas: ");
        float nilai_tugas = scanner.nextFloat(); 
        System.out.print("NILAI UTS: ");
        float nilai_uts = scanner.nextFloat(); 
        System.out.print("Nilai UAS: ");
        float nilai_uas = scanner.nextFloat(); 

        hasil = (0.2f * nilai_tugas ) + (0.35f * nilai_uts) + (0.45f * nilai_uas);

        System.out.println("Nilai Akhir =" + hasil);
        if (hasil >= 85)
        {
            System.out.println("NILAI akhir A");
        }
        else if (hasil >= 75)
        {
            System.out.println("NILAI AKHIR B");
        }
        else if (hasil >= 65)
        {
            System.out.println("NILAI AKHOR C");
        }
        else if (hasil >= 59)
        {
            System.out.println("NILAI AKHOR D");
        }
        else
        {
            System.out.println("NILAI AKHIR E");
        }
    }
    // System.out.println(" = " + hasil);

}
}