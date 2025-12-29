import java.util.Scanner;

public class RoundtoNearestGreaterInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        sc.close();
        
        int result = (int) Math.ceil(n);
        System.out.println(result);
    }
}
