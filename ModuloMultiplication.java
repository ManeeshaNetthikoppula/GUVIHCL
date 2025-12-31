import java.util.Scanner;

public class ModuloMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        
        long result = ((a % c) * (b % c)) % c;
        System.out.print(result);
    }
}

    

