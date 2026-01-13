import java.util.Scanner;

public class OddDigitSumCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int oddSum = 0;

        while (n > 0) {
            int digit = (int)(n % 10);

            if (digit % 2 != 0) {
                oddSum += digit;
            }

            n /= 10;
        }

        if (oddSum % 2 == 0)
            System.out.println("E");
        else
            System.out.println("O");
    }
    
}
