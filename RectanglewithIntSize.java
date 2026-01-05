import java.util.Scanner;

public class RectanglewithIntSize {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int A = sc.nextInt();
        if( P % 2 != 0){
        System.out.println("no");
        return;
        }
        int halfPerimeter = P/2;
        boolean possible = false;
        for(int l = 1; l * l <= A; l++) {
            if(A % l == 0){
                int w = A/l;
                if(l + w == halfPerimeter){
                    possible = true;
                    break;
                }
            }
            
        }
        System.out.println(possible ? "yes" : "no");
    }
    
}
