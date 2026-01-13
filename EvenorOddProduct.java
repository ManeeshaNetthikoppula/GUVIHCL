 import java.util.Scanner;
public class EvenorOddProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean isEvenProduct = false;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                isEvenProduct = true;
                break; 
            }
        }

        if (isEvenProduct)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}

    

