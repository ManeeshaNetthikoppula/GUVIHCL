import java.util.Scanner;

public class MaxSumofAdjacentPairs {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new  int[N];
        for(int i = 0; i < N;i++){
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < N-1;i++){
            sum += Math.max(arr[i], arr[i + 1]);
        }
        System.out.println(sum);
    }
    
}
