import java.util.Scanner;

public class PrefixSuffixSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        long totalSum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        sc.close();

        long leftSum = 0;

        for (int i = 0; i < N; i++) {
            long rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.println("yes");
                return;
            }
            leftSum += arr[i];
        }

        System.out.println("no");
    }
    
}
