import java.util.Scanner;

public class SumofSquaresofDigit3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int sum = 0;

        while (N > 0) {
            int digit = N % 10;
            sum += digit * digit;
            N /= 10;
        }

        System.out.println(sum);
    }
    
}
