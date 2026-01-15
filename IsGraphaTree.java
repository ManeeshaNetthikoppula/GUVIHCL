import java.util.Scanner;

public class IsGraphaTree {
     static int[] parent;

    
    static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    
    static boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

    
        if (pa == pb)
            return false;

        parent[pb] = pa;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        
        if (M != N - 1) {
            System.out.println("no");
            return;
        }

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++)
            parent[i] = i;

        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (!union(u, v)) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
    
}
