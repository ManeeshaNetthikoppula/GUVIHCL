import java.util.Scanner;

public class StringMiddleElementModification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String result = "";

        if (n % 2 == 0) {
            
            result = s.substring(0, n/2 - 1) + "**" + s.substring(n/2 + 1);
        } else {
            
            result = s.substring(0, n/2) + "*" + s.substring(n/2 + 1);
        }

        System.out.println(result);
        sc.close();
    }
}

    

