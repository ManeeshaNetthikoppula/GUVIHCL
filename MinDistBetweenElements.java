import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinDistBetweenElements {
      public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int U = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int lastU = -1, lastV = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] == U) {
                lastU = i;
                if (lastV != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastU - lastV));
                }
            }

            if (arr[i] == V) {
                lastV = i;
                if (lastU != -1) {
                    minDistance = Math.min(minDistance, Math.abs(lastU - lastV));
                }
            }
        }

        System.out.print(minDistance);
    }
    
}
