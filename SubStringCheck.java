import java.util.Scanner;

public class SubStringCheck {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String P = sc.next();
        sc.close();

        if (S.contains(P)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
