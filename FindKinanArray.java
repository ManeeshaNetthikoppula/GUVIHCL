import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindKinanArray {
      public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");

        int N = Integer.parseInt(first[0]);
        int K = Integer.parseInt(first[1]);

        int[] arr = new int[N];
        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

      
        Arrays.sort(arr);

       
        int left = 0, right = N - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == K) {
                found = true;
                break;
            } else if (arr[mid] < K) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(found ? "yes" : "no");
    }
    
}
