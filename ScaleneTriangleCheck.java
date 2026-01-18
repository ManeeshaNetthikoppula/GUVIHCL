import java.util.Scanner;

public class ScaleneTriangleCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean isTriangle = (A + B > C) && (B + C > A) && (A + C > B);
        boolean isScalene = (A != B) && (B != C) && (A != C);

        if (isTriangle && isScalene) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
