import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KthSmallestElement {
     public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (i == 0 || arr[i] != prev) {
                count++;
                prev = arr[i];
            }
            if (count == K) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println(-1); // Kth distinct element not found
    }
}

    

