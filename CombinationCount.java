import java.math.BigInteger;
import java.util.Scanner;

public class CombinationCount {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < K; i++) {
            result = result.multiply(BigInteger.valueOf(N - i));
        }

        System.out.println(result);
    }
    
}
