import java.util.Scanner;

public class BinaryLengthofDecimalNum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String binary = Integer.toBinaryString(N);
        System.out.println(binary.length());
    }
    
}
