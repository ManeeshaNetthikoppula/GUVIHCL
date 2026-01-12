import java.util.Scanner;

public class SmallestDivisibleNum {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long result = sc.nextInt();

        for (int i = 1; i < n; i++) {
            long num = sc.nextInt();
            result = lcm(result, num);
        }

        System.out.print(result);
    }
}

