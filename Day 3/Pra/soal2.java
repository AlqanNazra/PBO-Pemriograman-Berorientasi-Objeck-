public class soal2 {
    public static void main(String[] args) {
        String nama1 = "C";
        int nilai1 = 82;
        
        String nama2 = "Phyton";
        int nilai2 = 90;

        String nama3 = "Java";
        int nilai3 = 100;
        
      
        String formatString = String.format("%-15s %03d%n%-15s %03d%n%-15s %03d", nama1, nilai1, nama2, nilai2, nama3, nilai3);
    
        System.out.println("-------------------------------------------------");
        System.out.println(formatString);
        System.out.println("-------------------------------------------------");
    }
}
