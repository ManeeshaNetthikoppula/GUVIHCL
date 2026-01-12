import java.security.Key;
import java.util.Scanner;

public class GreatestCommonDivisor {
     static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            result = gcd(result, num);
        }

        System.out.print(result);
    }
}






    
