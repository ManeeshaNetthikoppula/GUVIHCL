import java.util.Scanner;

public class MoularExponentiation {
      static long modExp(long a, long b, long c) {
        long result = 1;
        a = a % c; 

        while (b > 0) {
            if ((b & 1) == 1) { 
                result = (result * a) % c;
            }
            a = (a * a) % c; 
            b >>= 1; 
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(modExp(A, B, C));
    }
}
    

