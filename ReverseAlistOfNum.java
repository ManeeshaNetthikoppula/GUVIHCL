import java.util.Scanner;

public class ReverseAlistOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append("->");
            }
        }

        System.out.println(sb.toString());
    }
    
}
