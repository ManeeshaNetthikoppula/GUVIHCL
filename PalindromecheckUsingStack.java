import java.util.Scanner;
import java.util.Stack;

public class PalindromecheckUsingStack {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "yes" : "no");
        sc.close();
    }
    
}
