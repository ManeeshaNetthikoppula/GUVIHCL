import java.util.Scanner;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        sc.close();

        // Split input by space or minus
        String[] parts = input.split("[\\s-]+");
        if(parts.length != 2) {
            System.out.println(-1);
            return;
        }

        try {
            int N = Integer.parseInt(parts[0]);
            int M = Integer.parseInt(parts[1]);

            if (N <= 0 || M <= 0) {
                System.out.println(-1);
                return;
            }

            // Euclidean algorithm for GCD
            while (M != 0) {
                int temp = M;
                M = N % M;
                N = temp;
            }

            System.out.println(N);

        } catch (NumberFormatException e) {
            System.out.println(-1);
        }
    }
}
    

