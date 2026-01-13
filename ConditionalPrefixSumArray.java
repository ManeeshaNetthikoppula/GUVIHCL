import java.util.Scanner;

public class ConditionalPrefixSumArray {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int prefixSum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                System.out.print(prefixSum + " ");
            } else {
                System.out.print(num + " ");
            }
        }
    }
    
}
