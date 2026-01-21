import java.util.Scanner;
public class Compute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        
        long result = (long) Math.pow(A, B);

        System.out.println(result);
    }
    
}
