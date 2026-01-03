import java.util.Scanner;

public class ParenthesesBalancing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                balance++;
            } else { // ')'
                balance--;
            }

    
            if (balance < 0) {
                System.out.println("no");
                return;
            }
        }


        if (balance == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

    

