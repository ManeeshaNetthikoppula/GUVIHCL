import java.util.Scanner;

public class CheckDivisibilityby13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n % 13 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
