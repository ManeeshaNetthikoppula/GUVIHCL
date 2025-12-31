import java.util.Scanner;

public class ReverseaNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int reversed = 0;
        while (N > 0) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N = N / 10;
        }
        
        System.out.print(reversed);
    }
}

    

