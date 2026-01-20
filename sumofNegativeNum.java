import java.util.Scanner;

public class sumofNegativeNum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < 0) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
    
}
