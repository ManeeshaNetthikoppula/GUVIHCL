import java.util.Scanner;
public class HexaDecimalStringValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();  

        if (s.length() == 0) {
            System.out.println("no");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!((c >= '0' && c <= '9') ||
                  (c >= 'A' && c <= 'F') ||
                  (c >= 'a' && c <= 'f'))) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
    
}
