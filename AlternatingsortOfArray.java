import java.util.Arrays;
import java.util.Scanner;

public class AlternatingsortOfArray {
    
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        int left = 0, right = N - 1;
        int[] res = new int[N];
        int index = 0;

        while (left <= right) {
            if (index < N) res[index++] = arr[right--]; // max
            if (index < N) res[index++] = arr[left++];  // min
        }

        for (int i = 0; i < N; i++) {
            System.out.print(res[i] + (i == N - 1 ? "\n" : " "));
        }
    }
    
}
