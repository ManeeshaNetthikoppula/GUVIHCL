import java.util.Scanner;

public class PermutuationCheckof1toN{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean[] seen = new boolean[N + 1]; // indices 1 to N

        boolean isPermutation = true;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num < 1 || num > N || seen[num]) {
                isPermutation = false;
                break;
            }

            seen[num] = true;
        }

        if (isPermutation) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
