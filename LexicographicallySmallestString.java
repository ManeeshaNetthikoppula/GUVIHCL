import java.util.Scanner;

public class LexicographicallySmallestString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String smallest = sc.next();

        for (int i = 1; i < N; i++) {
            String current = sc.next();
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
        }

        System.out.println(smallest);
    }
    
}
