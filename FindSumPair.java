import java.util.HashSet;
import java.util.Scanner;

public class FindSumPair {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (set.contains(K - num)) {
                found = true;
                break;
            }
            set.add(num);
        }

        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
