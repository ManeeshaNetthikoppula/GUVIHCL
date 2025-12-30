import java.util.Scanner;

public class digitsoddinanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        
        boolean hasOdd = false;
        
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (digit % 2 != 0) {
                if (hasOdd) System.out.print(" ");
                System.out.print(digit);
                hasOdd = true;
            }
        }
        
        if (!hasOdd) {
            System.out.print("-1");
        }
    }
}

    

