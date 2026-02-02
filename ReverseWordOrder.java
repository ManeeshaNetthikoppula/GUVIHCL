import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseWordOrder {
     public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int spaceIndex = s.indexOf(' ');

        String first = s.substring(0, spaceIndex);
        String second = s.substring(spaceIndex + 1);

        System.out.print(second + " " + first);
    }
    
}
