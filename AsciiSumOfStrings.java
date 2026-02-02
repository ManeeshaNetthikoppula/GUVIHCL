import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AsciiSumOfStrings {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i);
        }

        System.out.print(sum);
    }
    
}
