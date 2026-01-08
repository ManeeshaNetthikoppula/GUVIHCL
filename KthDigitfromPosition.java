import java.util.Scanner;

public class KthDigitfromPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int p = sc.nextInt();
        int k = sc.nextInt();

        int index = p + k - 1;

        if (index <= n.length()) {
            System.out.println(n.charAt(index - 1));
        }
    }
}
