import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int K = sc.nextInt();
        int n = s.length();
        K = K % n;
        String rotated = s.substring(K) + s.substring(0,K);
        System.out.println(rotated);
    }
    
}
