import java.util.Scanner;

public class PerfectSquareProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int product = n * m;
        int sqrt = (int) Math.sqrt(product);

        if (sqrt * sqrt == product) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

    

