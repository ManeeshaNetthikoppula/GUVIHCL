import java.util.Scanner;

public class RockPaperScissorswinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.equals(b)) {
            System.out.println("D");
        } else if (
            (a.equals("R") && b.equals("S")) ||
            (a.equals("S") && b.equals("P")) ||
            (a.equals("P") && b.equals("R"))
        ) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
