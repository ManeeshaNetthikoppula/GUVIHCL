import java.util.Arrays;
import java.util.Scanner;

public class GoldBachs {
     static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N < 4) {
            System.out.println(0);
            return;
        }

        boolean[] isPrime = sieve(N);
        int count = 0;

        for (int p = 2; p <= N / 2; p++) {
            if (isPrime[p] && isPrime[N - p]) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
