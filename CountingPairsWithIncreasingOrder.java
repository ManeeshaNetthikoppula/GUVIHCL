import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingPairsWithIncreasingOrder {
    static class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int i, int val) {
            while (i <= n) {
                bit[i] += val;
                i += i & -i;
            }
        }

        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for (int val : sorted) {
            if (!rank.containsKey(val)) {
                rank.put(val, r++);
            }
        }
        Fenwick fw = new Fenwick(rank.size());
        long count = 0;
        for (int i = N - 1; i >= 0; i--) {
            int idx = rank.get(arr[i]);
            count += fw.query(rank.size()) - fw.query(idx);
            fw.update(idx, 1);
        }

        System.out.println(count);
    }
    
}
