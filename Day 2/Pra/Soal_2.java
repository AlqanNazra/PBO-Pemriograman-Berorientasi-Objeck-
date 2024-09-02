public class Soal_2 { 
    // public static void main(String[] args) { 
    //  final double CM_PER_INCH = 2.54; 
    //  double paperWidth = 8.5; 
    //  double paperHeight = 11; 
    //  System.out.println("Paper size in centimeters: " + 
    //  paperWidth * CM_PER_INCH + " by " + paperHeight * 
    //  CM_PER_INCH); 
    // } 
    // }


    // public class Constants2 { 
        public static final double CM_PER_INCH = 2.54; 
        public static void main(String[] args) {
        double paperWidth = 8.5; 
        double paperHeight = 11; 
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
        } 
       //}


    /*Ini merupakan program yang menentukan sebuah variabel yang dapat digunakan 
     * dalam variabel yang dimana probram ini menunjukka variabel yang dapat digunakan dalam
     * Mainnya dan variabel yang dapat digunakan pada class lain
     * 
     * Jawaban pertanyaan 1
     * Output dari kedua program memiliki output yang sama diantaran program satu dan program dua walaupun terdapat
     * perberdaan dalam metode assign pada variabel CM_PER_INCH.
     * 
     * Jawaban Pertanyaan 2
     * Perbedaan dalan final double dan public static final terdapat pada penggunaanya keduanya memiliki kesamaan 
     * dalam sifat perubahan nilai dimana keduanya tidak dapat berubah nilainya oleh program lain ini yang membuatnya
     * menjadi variabel permanen atau tetap, keduanya memiliki perbedaan dalam funsi pada final itu hanya dapat digunakan 
     * pada public staticnya saja atau pada modul yang mengassignnya bila public static final variabel ini dapat dibaca oleh 
     * modul lain yang terdapat didalamnnya cara kerja mirip dengan global variabel namun berbeda.
     */

    }