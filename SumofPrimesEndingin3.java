import java.util.Arrays;
import java.util.Scanner;

public class SumofPrimesEndingin3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N < 2) {
            System.out.println(0);
            return;
        }

        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i] && i % 10 == 3) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
    
}
