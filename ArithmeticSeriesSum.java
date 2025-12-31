import java.util.Scanner;

public class ArithmeticSeriesSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(); 
        long B = sc.nextLong(); 
        long C = sc.nextLong(); 
        sc.close();
        
        
        long sum = (C * (2 * A + (C - 1) * B)) / 2;
        System.out.print(sum);
    }
}

    
