import java.util.Scanner;

public class StringExpansion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            i++;
            int num = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }
            if (num % 2 == 0) {
                for (int j = 0; j < num; j++) {
                    result.append(ch);
                }
            } 
            else {
                result.append(ch).append(num);
            }
        }

        System.out.print(result.toString());
    }
    
}
