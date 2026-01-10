import java.util.Scanner;

public class suffixsumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int[] suffix = new int[N];

        
        for (int i = N - 1; i >= 0; i--) {
            sum += arr[i];
            suffix[i] = sum;
        }

        
        for (int num : suffix) {
            System.out.print(num + " ");
        }
    }
}
    
