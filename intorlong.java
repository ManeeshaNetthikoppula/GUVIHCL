import java.util.Scanner;

public class intorlong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
        System.out.println("INT");
        }
        else{
            System.out.println("LONG");
        }
    }
    
}
