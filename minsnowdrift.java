import java.util.*;

public class minsnowdrift {

    
    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            if (pa != pb)
                parent[pb] = pa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        DSU dsu = new DSU(N);

        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (x[i] == x[j] || y[i] == y[j]) {
                    dsu.union(i, j);
                }
            }
        }


        Set<Integer> components = new HashSet<>();
        for (int i = 0; i < N; i++) {
            components.add(dsu.find(i));
        }


        System.out.println(components.size() - 1);
    }
}
