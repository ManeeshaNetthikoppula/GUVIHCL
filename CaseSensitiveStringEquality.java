import java.util.Scanner;

public class CaseSensitiveStringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        sc.close();
        
        if (areEqual(S1, S2)) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
    
    private static boolean areEqual(String s1, String s2) {
        
        int len1 = 0, len2 = 0;
        for (char c : s1.toCharArray()) len1++;
        for (char c : s2.toCharArray()) len2++;
        if (len1 != len2) return false;
        
       
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    
}
