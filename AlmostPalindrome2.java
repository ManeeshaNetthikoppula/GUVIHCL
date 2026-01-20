import java.util.Scanner;

public class AlmostPalindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int left = 0;
        int right = s.length() - 1;
        int mismatch = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                mismatch++;
                if (mismatch > 1) {
                    System.out.println("no");
                    return;
                }
            }
            left++;
            right--;
        }

        System.out.println("yes");
    }
    

}
