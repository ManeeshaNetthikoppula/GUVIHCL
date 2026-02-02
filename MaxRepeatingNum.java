import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxRepeatingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int maxNum = 0;

        for (int num : arr) {
            if (freq.get(num) > maxCount) {
                maxCount = freq.get(num);
                maxNum = num;
            }
        }

        System.out.println(maxNum);
    }
    
}
