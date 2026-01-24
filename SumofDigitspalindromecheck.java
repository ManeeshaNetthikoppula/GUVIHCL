import java.util.Scanner;

public class SumofDigitspalindromecheck {
      static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();   // Read as string (very large number)
        int sum = 0;

        for (char c : n.toCharArray()) {
            sum += c - '0';
        }

        if (isPalindrome(sum)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
    
}
