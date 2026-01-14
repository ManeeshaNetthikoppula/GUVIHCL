import java.util.Scanner;

public class ReachablePoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean reachable = false;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= m && m <= b) {
                reachable = true;
                break;
            }
        }

        if (reachable)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
}
