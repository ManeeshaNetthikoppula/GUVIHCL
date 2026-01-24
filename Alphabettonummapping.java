import java.util.Scanner;

public class Alphabettonummapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1; 
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            // One digit
            int oneDigit = s.charAt(i - 1) - '0';
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        System.out.println(dp[n]);
    }
    
}
