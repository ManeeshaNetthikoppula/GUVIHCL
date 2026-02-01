import java.util.Scanner;

public class PasswordGenFromStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.next();
        String Q = sc.next();
        sc.close();

        StringBuilder password = new StringBuilder();

        int i = 0, num = 1;
        int n = P.length(), m = Q.length();
        int maxLen = Math.max(n, m);

        for (i = 0; i < maxLen; i++) {

            if (i < n)
                password.append(P.charAt(i));
            else
                password.append(num++);

            if (i < m)
                password.append(Q.charAt(i));
            else
                password.append(num++);
        }

        System.out.println(password.toString());
    }
    
}
