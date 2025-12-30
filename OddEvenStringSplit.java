import java.util.Scanner;

public class OddEvenStringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                odd.append(s.charAt(i));
            else
                even.append(s.charAt(i));
        }

        System.out.print(odd.toString() + " " + even.toString());
    }
}
