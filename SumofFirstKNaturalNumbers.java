import java.util.Scanner;

public class SumofFirstKNaturalNumbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();
        
        int sum = (K * (K + 1)) / 2;
        System.out.print(sum);
    }
    
}
