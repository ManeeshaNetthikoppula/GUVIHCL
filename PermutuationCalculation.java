import java.util.Scanner;
public class PermutuationCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = N >> K;
        for(int i =N; i > N; i++){
            result *= i;
            System.out.println(result);
        }
    }
    
}
