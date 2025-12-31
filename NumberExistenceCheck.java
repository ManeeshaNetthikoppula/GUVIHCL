import java.util.Scanner;

public class NumberExistenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == K) {
                found = true;
            }
        }
        sc.close();
        
        if (found)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}

    

