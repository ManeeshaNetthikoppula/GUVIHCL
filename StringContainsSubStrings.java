import java.util.Scanner;

public class StringContainsSubStrings {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.contains("GUVI") && s.contains("GEEK")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
