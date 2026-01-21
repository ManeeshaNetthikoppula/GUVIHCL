import java.util.Scanner;

public class DiagonalSumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long primarySum = 0;
        long secondarySum = 0;

        for (int i = 0; i < N; i++) {
            primarySum += matrix[i][i];            
            secondarySum += matrix[i][N - 1 - i];  
        }

        System.out.println(primarySum * secondarySum);
    }
    
}
