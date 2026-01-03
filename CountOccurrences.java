import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();   // Read as string
        char K = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == K) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }
}
