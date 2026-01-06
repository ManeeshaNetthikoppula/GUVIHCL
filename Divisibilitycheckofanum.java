import java.util.Scanner;

public class Divisibilitycheckofanum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if( N <= 2){
            System.out.println("no");
            return;
        }
        for(int i = 2; i < N; i++ ){
            if( N% i == 0){
                System.out.println("yes");
                return;
            }
        }
            System.out.println("no");
    }
}
    

