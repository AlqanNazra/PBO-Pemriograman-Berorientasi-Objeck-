public class soal5 {
    // 05.40
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";

        int jmlhA = A.length();
        int jmlhB = B.length();

        int hasil = jmlhA + jmlhB;
        System.err.println(+hasil);
        int result = A.compareTo(B);
        if (result >= jmlhA)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }

        String Abesar = A.substring(0, 1).toUpperCase();
        String Bbesar = B.substring(0, 1).toUpperCase();
        String ByeA   = A.replace("h", "");
        String ByeB   = B.replace("j", "");
        System.out.println(Abesar+ByeA+" "+Bbesar+ByeB);

    }
}
