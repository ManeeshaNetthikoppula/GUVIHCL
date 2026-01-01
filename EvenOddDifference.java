import java.util.Scanner;

public class EvenOddDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        
        int diff = Math.abs(N - M);
        
        if (diff % 2 == 0)
            System.out.print("even");
        else
            System.out.print("odd");
    }
}

    
