import java.util.Scanner;
public class ConsecutiveStringCheck2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        boolean found = false;

        for (int i = 0; i <= N - K; i++) {
            boolean same = true;
            for (int j = 1; j < K; j++) {
                if (!arr[i].equals(arr[i + j])) {
                    same = false;
                    break;
                }
            }
            if (same) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    

    }
}