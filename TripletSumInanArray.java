import java.util.HashMap;
import java.util.Scanner;

public class TripletSumInanArray {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long count = 0;

        for (int k = 2; k < N; k++) {
            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < k; i++) {
                int needed = arr[k] - arr[i];
                if (freq.containsKey(needed)) {
                    count += freq.get(needed);
                }
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }
        }

        System.out.println(count);
        sc.close();
    }
    
}
