public class ShortestPathInaGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int E = sc.nextInt();
        int A = sc.nextInt();

        // Adjacency list
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();

        // Read edges (undirected)
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // BFS
        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        dist[1] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : graph[node]) {
                if (dist[nei] == -1) {
                    dist[nei] = dist[node] + 1;
                    q.add(nei);
                }
            }
        }

        System.out.println(dist[A]);
    }
    
}
