import java.util.Scanner;

public class PrimeCountInBinaryRange {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        for (int i = a; i <= b; i++) {
            int onesCount = Integer.bitCount(i); // count of 1's in binary
            if (isPrime(onesCount)) {
                count++;
            }
        }

        System.out.print(count);
    }
    
}
