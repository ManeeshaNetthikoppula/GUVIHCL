import java.util.Scanner;

public class checkdiff { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int k = sc.nextInt();

        int minLen = Math.min(s1.length(), s2.length());
        int diffCount = 0;

        
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }

        diffCount += Math.abs(s1.length() - s2.length());

        if (diffCount == k) {
            System.out.println("yes");
        }
        else {
            System.out.print("-1");
        }
    }
}
