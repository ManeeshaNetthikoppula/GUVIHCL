import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindKorNearestSmaller {
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
        int nearestSmaller = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == K) {
                System.out.println(K);
                return;
            } else if (arr[mid] < K) {
                nearestSmaller = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(nearestSmaller);
    }
    
}
