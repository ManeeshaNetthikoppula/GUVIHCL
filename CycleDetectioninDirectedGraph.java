import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CycleDetectioninDirectedGraph {
    
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static Set<Integer> visited = new HashSet<>();
    static Set<Integer> recStack = new HashSet<>();

    static boolean dfs(int node) {
        visited.add(node);
        recStack.add(node);

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor))
                    return true;
            } else if (recStack.contains(neighbor)) {
                return true; // cycle detected
            }
        }

        recStack.remove(node);
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
        }

        for (int node : graph.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(node)) {
                    System.out.println("yes");
                    return;
                }
            }
        }

        System.out.println("no");
    }
    
}
