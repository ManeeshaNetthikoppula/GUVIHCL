import java.util.Scanner;

public class DiagonalProductSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long primaryProduct = 1;
        long secondaryProduct = 1;

        for (int i = 0; i < N; i++) {
            primaryProduct *= matrix[i][i];            
            secondaryProduct *= matrix[i][N - 1 - i];  
        }

        System.out.println(primaryProduct + secondaryProduct);
    }
    
}
