
import java.util.StringTokenizer;

public class soal1
{
    public static void main(String[] args) {
        String kalimat = "I wasn't home";
        // StringTokenizer output = new StringTokenizer(kalimat);
        StringTokenizer output = new StringTokenizer(kalimat, " !,#?'@#$*_+<>");
        int jmlhA = output.countTokens();
        System.out.println(jmlhA);
        String[] token = kalimat.split("(?=[^a-zA-Z])|(?<=[^a-zA-Z])");
        System.err.println(token.length);
        while (output.hasMoreTokens()) {

            String out = output.nextToken();  
            System.err.println(out);
        }
    }
}