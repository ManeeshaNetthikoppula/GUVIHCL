import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int power = 1;
        while (power <= n) {
            power *= 2;
        }
        System.out.println(power);
    }
}

    
