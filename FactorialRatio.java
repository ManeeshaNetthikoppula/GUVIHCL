import java.util.Scanner;

public class FactorialRatio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = 1;
        for (int i = b + 1; i <= a; i++) {
            result *= i;
        }

        System.out.println(result);
    }
    
}
