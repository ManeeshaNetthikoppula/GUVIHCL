import java.util.PriorityQueue;
import java.util.Scanner;

public class SmallestNumberaftereachInput {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
            sb.append(pq.peek());
            if (i != N - 1) {
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());
    }
}
