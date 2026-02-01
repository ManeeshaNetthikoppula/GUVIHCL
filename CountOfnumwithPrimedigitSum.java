import java.util.Scanner;

public class CountOfnumwithPrimedigitSum {
     static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Function to calculate digit sum
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        int count = 0;

        for (int i = L; i < R; i++) {
            int sum = digitSum(i);
            if (isPrime(sum)) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
