import java.util.Scanner;

public class sumofdigitpower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();   
        sc.close();

        long sum = 0;

        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            sum += Math.pow(digit, i);
        }

        System.out.println(sum);
    }
    
}
