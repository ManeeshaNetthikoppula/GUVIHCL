import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class HybridSortofanArray {
     public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);

        int[] arr = new int[N];
        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        
        Arrays.sort(arr, 0, K);

        
        Integer[] temp = new Integer[N - K];
        for (int i = K; i < N; i++) {
            temp[i - K] = arr[i];
        }

        Arrays.sort(temp, Collections.reverseOrder());

        // Put back into array
        for (int i = K; i < N; i++) {
            arr[i] = temp[i - K];
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    
}
