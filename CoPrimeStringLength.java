import java.util.Scanner;

public class CoPrimeStringLength {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int len1 = s1.length();
        int len2 = s2.length();
        if (gcd(len1, len2) == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
