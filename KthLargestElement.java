import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            minHeap.add(arr[i]);
            if (minHeap.size() > K) {
                minHeap.poll();
            }
        }

        System.out.println(minHeap.peek());
        sc.close();
    }  
}
