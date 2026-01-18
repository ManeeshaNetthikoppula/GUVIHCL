import java.util.Arrays;
import java.util.Scanner;

public class RightAngledTriangleCheck {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];
        sides[0] = sc.nextInt();
        sides[1] = sc.nextInt();
        sides[2] = sc.nextInt();
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        boolean isTriangle = (a + b > c);
        boolean isRightAngled = (c * c == a * a + b * b);

        if (isTriangle && isRightAngled) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
    
}
