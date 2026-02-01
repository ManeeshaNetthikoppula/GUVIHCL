import java.util.Scanner;
public class SumofDigitPower {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();

        int digits = N.length();
        long sum = 0;

        for (int i = 0; i < digits; i++) {
            int d = N.charAt(i) - '0';
            sum += Math.pow(d, digits);
        }

        System.out.print(sum);
    }
    
}
