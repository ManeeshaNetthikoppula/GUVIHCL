import java.util.Scanner;

public class CountNumOccurence {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == K) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("yes " + count);
        } else {
            System.out.println("no");
        }
    }
    
}
