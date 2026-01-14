import java.util.Scanner;
public class Firstspositionfromright {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int position = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                System.out.println(position);
                return;
            }
            n = n >> 1;
            position++;
        }
    }
    
}
