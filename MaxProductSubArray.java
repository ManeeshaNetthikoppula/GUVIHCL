import java.util.Scanner;

public class MaxProductSubArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        long maxProd = arr[0];
        long maxEndingHere = arr[0];
        long minEndingHere = arr[0];

        for (int i = 1; i < N; i++) {
            long num = arr[i];

            if (num < 0) {
                long temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(num, maxEndingHere * num);
            minEndingHere = Math.min(num, minEndingHere * num);

            maxProd = Math.max(maxProd, maxEndingHere);
        }

        System.out.println(maxProd);
    }
    
}
