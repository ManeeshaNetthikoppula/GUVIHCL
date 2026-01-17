import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SameBasealphabets {
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        String s1 = input[0];
        String s2 = input[1];
        boolean[] set1 = new boolean[26];
        boolean[] set2 = new boolean[26];
        for (char c : s1.toCharArray()) {
            set1[c - 'a'] = true;
        }
        for (char c : s2.toCharArray()) {
            set2[c - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (set1[i] != set2[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    
}
