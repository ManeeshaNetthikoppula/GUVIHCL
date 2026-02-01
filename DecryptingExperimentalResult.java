import java.util.Scanner;

public class DecryptingExperimentalResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String s = sc.next();
            if (s.equals("1") || s.equals("4") || s.equals("78")) {
                System.out.println("+");
            }
            else if (s.endsWith("35")) {
                System.out.println("-");
            }
            else if (s.startsWith("9") && s.endsWith("4")) {
                System.out.println("*");
            }
            else if (s.startsWith("190")) {
                System.out.println("?");
            }
            else {
                System.out.println("?");
            }
        }
        sc.close();
    }
    
}
