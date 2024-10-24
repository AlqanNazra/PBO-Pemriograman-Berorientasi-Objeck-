
class Invalidumur extends Exception {
    public Invalidumur(String message) {
        super(message);
    }
}

public class Umur {
    public static void checkAge(int age) throws Invalidumur {
        if (age < 18) {
            throw new Invalidumur("Usia tidak valid. Usia harus 18 tahun atau lebih.");
        } else {
            System.out.println("Usia valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Invalidumur e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
