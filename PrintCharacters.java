import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        
        if (s.length() >= 3) {
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(2));
        } else {
            
            if (s.length() >= 1) System.out.print(s.charAt(0));
            if (s.length() >= 3) System.out.print(s.charAt(2));
        }
    }
}
