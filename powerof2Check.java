import java.util.Scanner;

public class powerof2Check {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N > 0 && (N & (N - 1)) == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
