public class Main {
    public static void main(String[] args) {
        String original = "Hello, World 123!";
        // Menghapus semua angka dari string
        String result = original.replaceAll("[0-9]", "");
        
        System.out.println("Hasil: " + result); // Output: Hello, World !
    }
}
    
