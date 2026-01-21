import java.util.Scanner;

public class LongestNonPalindromeSubString {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (!isPalindrome(s)) {
            
            System.out.println(s);
        } else {
            
            System.out.println(s.substring(0, s.length() - 1));
        }
    }
    
}
