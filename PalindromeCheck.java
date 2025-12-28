import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();
        
        String rev = new StringBuilder(s).reverse().toString();
        
        if (s.equals(rev))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

    
