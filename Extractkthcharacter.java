import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Extractkthcharacter{
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        String s = input[0];
        int k = Integer.parseInt(input[1]);

        StringBuilder sb = new StringBuilder();

        for (int i = k - 1; i < s.length(); i += k) {
            sb.append(s.charAt(i)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    
}
