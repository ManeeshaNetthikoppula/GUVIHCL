import java.util.Scanner;

public class RightAngledTrianglePattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) {
            int count = 2 * i - 1;
            for (int j = 0; j < count; j++) {
                System.out.print("1");
                if (j < count - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
