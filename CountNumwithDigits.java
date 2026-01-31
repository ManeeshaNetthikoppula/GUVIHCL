import java.util.Scanner;

public class CountNumwithDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int N = sc.nextInt();

        String target = String.valueOf(N);
        int count = 0;

        for (int i = L; i <= R; i++) {
            if (String.valueOf(i).contains(target)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
    
}
