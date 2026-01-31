import java.util.Arrays;
import java.util.Scanner;

public class ThreeprimeSumRepresentation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        boolean[] isPrime = sieve(N);

        // Fix first prime as 2 (smallest possible)
        int p1 = 2;

        for (int p2 = 2; p2 <= N; p2++) {
            int p3 = N - p1 - p2;

            if (p3 < p2) break; // maintain increasing order

            if (isPrime[p2] && isPrime[p3]) {
                System.out.println(p1 + " " + p2 + " " + p3);
                return;
            }
        }
    }

    private static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
    
}
