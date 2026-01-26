import java.util.HashSet;
import java.util.Scanner;

public class SubsetCheckOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < M; i++) B[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int num : A) set.add(num);

        boolean isSubset = true;
        for (int num : B) {
            if (!set.contains(num)) {
                isSubset = false;
                break;
            }
        }

        System.out.println(isSubset ? "yes" : "no");
        sc.close();
    }
    
}
