import java.util.Scanner;

public class BitwiseXORofanArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = sc.nextInt();
        for(int i =0; i < N; i++){
            result ^= sc.nextInt();
        }
        System.out.println(result);
    }
    
}
