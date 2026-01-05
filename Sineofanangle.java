import java.util.Scanner;

public class Sineofanangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double radians = Math.toRadians(angle);
        double sineValue = Math.sin(radians);
        System.out.println(sineValue);
    }
    
}
