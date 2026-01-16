import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MaxEdgesinBipartiteTree {
     public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            String[] parts = br.readLine().split(" ");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            graph[u].add(v);
            graph[v].add(u);
        }

        int[] color = new int[N + 1];
        Arrays.fill(color, -1);

        long cnt0 = 0, cnt1 = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        color[1] = 0;
        cnt0++;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : graph[node]) {
                if (color[nei] == -1) {
                    color[nei] = 1 - color[node];
                    if (color[nei] == 0) cnt0++;
                    else cnt1++;
                    q.add(nei);
                }
            }
        }

        long maxBipartiteEdges = cnt0 * cnt1;
        long existingEdges = N - 1;

        System.out.println(maxBipartiteEdges - existingEdges);
    }
    
}
