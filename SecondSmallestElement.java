import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if (N < 2) {  // cannot find second smallest
            System.out.print("-1");
            return;
        }
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            
            if (num < first) {
                second = first;
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
        }
        sc.close();
        
        if (second == Integer.MAX_VALUE) {
            System.out.print("-1");
        } else {
            System.out.print(second);
        }
    }
    
}
