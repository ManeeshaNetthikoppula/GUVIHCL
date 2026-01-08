import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfConsecutivePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        
        Arrays.sort(arr);

        
        int[] temp = new int[N];
        int left = 0, right = N - 1;
        int idx = 0;

        while (left <= right) {
            if (left <= right) temp[idx++] = arr[left++];
            if (left <= right) temp[idx++] = arr[right--];
        }
        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += Math.max(temp[i], temp[i + 1]);
        }

        System.out.println(sum);
    }
    
}
