import java.util.HashSet;
import java.util.Scanner;

public class CountingLuckyNumInAnArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        int count = 0;

        // i is 1-based index
        for (int i = 1; i <= N; i++) {
            if (set.contains(N * i)) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
