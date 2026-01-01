import java.util.Scanner;

public class CountElementOccurrences {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == K) {
                count++;
            }
        }
        sc.close();
        
        if (count > 0)
            System.out.print(count);
        else
            System.out.print("-1");
    }
}

    

