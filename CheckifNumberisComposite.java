import java.util.Scanner;

public class CheckifNumberisComposite{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println("no"); 
            return;
        }

        boolean isComposite = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
