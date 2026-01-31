import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmallestNumwithdigitsumN {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        if (N == 0) {
            System.out.println(0);
            return;
        }
        
        List<Integer> digits = new ArrayList<>();
        
        while (N > 0) {
            int d = Math.min(9, N);
            digits.add(d);
            N -= d;
        }
        
        Collections.reverse(digits);
        
        for (int digit : digits) {
            System.out.print(digit);
        }
    }

    
}
