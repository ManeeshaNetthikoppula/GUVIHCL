import java.util.Scanner;

public class RepeatingDigitsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean[] seen = new boolean[10];
        for(int i =0; i < n.length();i++){
            int digit = n.charAt(i) - '0';
            if(seen[digit]){
                System.out.println("yes");
                return;
            }
            seen[digit] = true;
        }
        System.out.println("no");
    }
    
}
