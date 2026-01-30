import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountingJumpingNums {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        System.out.println(countJumpingNumbers(N));
    }
    
    private static int countJumpingNumbers(int N) {
        if (N < 10) return N + 1; // all numbers 0..N are jumping
        
        int count = 1; // counting 0
        Queue<Integer> q = new LinkedList<>();
        
        // Initialize queue with 1-9
        for (int i = 1; i <= 9 && i <= N; i++) {
            q.add(i);
            count++;
        }
        
        while (!q.isEmpty()) {
            int num = q.poll();
            int lastDigit = num % 10;
            
            // Next possible digits
            int nextNum1 = num * 10 + (lastDigit - 1);
            int nextNum2 = num * 10 + (lastDigit + 1);
            
            if (lastDigit > 0 && nextNum1 <= N) {
                q.add(nextNum1);
                count++;
            }
            
            if (lastDigit < 9 && nextNum2 <= N) {
                q.add(nextNum2);
                count++;
            }
        }
        
        return count;
    }
    
}
