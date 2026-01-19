import java.util.Scanner;

public class SolveLinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int y = a * x + b;

        System.out.println(y);
    } 
}
