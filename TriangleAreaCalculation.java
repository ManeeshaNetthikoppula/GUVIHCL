import java.util.Scanner;

public class TriangleAreaCalculation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long B = sc.nextLong();
        long H = sc.nextLong();

        double area = 0.5 * B * H;  

        if (area == (long) area) {
            System.out.println((long) area);
        } else {
            System.out.println(area);
        }
    }
    
}
