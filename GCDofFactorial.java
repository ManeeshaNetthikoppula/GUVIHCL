import java.math.BigInteger;
import java.util.Scanner;

public class GCDofFactorial {
     public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int n = Math.min(A, B);

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);
    }
    
}
