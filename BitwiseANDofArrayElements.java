import java.util.Scanner;

public class BitwiseANDofArrayElements{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = sc.nextInt();
        for(int i = 1; i < N; i++){
            int val = sc.nextInt();
            result &= val;
        }
        System.out.println(result);
    }
}
        