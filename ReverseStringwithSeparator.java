import java.util.Scanner;

public class ReverseStringwithSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
            if (i != 0) {
                sb.append("-");
            }
        }

        System.out.println(sb.toString());
    }
}
    

