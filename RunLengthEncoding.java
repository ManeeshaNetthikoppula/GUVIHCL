import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunLengthEncoding {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        if (s.length() == 0) {
            System.out.println("");
            return;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                prev = curr;
                count = 1;
            }
        }
        sb.append(prev).append(count);

        System.out.println(sb.toString());
    }
    
}
