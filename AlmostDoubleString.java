import java.util.Scanner;

public class AlmostDoubleString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            int len = n - 1;
            if (len % 2 != 0) continue;  
            int half = len / 2;
            boolean ok = true;
            for (int j = 0; j < half; j++) {
                
                int first = j >= i ? j + 1 : j;
                int second = j + half >= i ? j + half + 1 : j + half;
                
                if (s.charAt(first) != s.charAt(second)) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                found = true;
                break;
            }
        }
        
        System.out.println(found ? "YES" : "NO");
        sc.close();
    }
    
}
