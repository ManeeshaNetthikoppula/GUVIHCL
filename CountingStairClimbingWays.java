import java.util.*;
import java.math.BigInteger;
public class CountingStairClimbingWays {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // dp array using BigInteger
        BigInteger[] dp = new BigInteger[N + 2];

        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        System.out.println(dp[N]);
    }
    
}
