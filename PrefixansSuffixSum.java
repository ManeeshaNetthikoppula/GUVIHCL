import java.util.Scanner;
public class PrefixansSuffixSum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[N];
        int[] suffix = new int[N];

        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

    
        sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            sum += arr[i];
            suffix[i] = sum;
        }

    
        for (int i = 0; i < N; i++) {
            System.out.print((prefix[i] + suffix[i]) + " ");
        }
    }
}

    

