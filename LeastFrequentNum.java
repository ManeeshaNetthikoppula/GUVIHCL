import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeastFrequentNum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq < minFreq || (freq == minFreq && num < result)) {
                minFreq = freq;
                result = num;
            }
        }

        System.out.println(result);
    }
    
}
