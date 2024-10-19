public class Paint {
    // Atribut yang menunjukkan cakupan cat (area yang bisa dicat per satuan cat)
    private double coverage;

    // Konstruktor untuk inisialisasi cakupan cat
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Metode untuk menghitung jumlah cat yang dibutuhkan untuk mengecat suatu bentuk
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;  // Jumlah cat yang dibutuhkan = luas permukaan / cakupan
    }
}
