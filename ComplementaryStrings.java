import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComplementaryStrings {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().trim();
        String s2 = br.readLine().trim();
        boolean[] seen = new boolean[26];
        for (char c : s1.toCharArray()) {
            int idx = c - 'A';
            if (seen[idx]) {
                System.out.println("no");
                return;
            }
            seen[idx] = true;
        }
        for (char c : s2.toCharArray()) {
            int idx = c - 'A';
            if (seen[idx]) {
                System.out.println("no");
                return;
            }
            seen[idx] = true;
        }
        for (boolean b : seen) {
            if (!b) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
    
}
