import java.util.Scanner;

public class CountingIslands2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    boolean isIsland = true;

                    // Up
                    if (i - 1 >= 0 && mat[i - 1][j] == 1) isIsland = false;
                    // Down
                    if (i + 1 < N && mat[i + 1][j] == 1) isIsland = false;
                    // Left
                    if (j - 1 >= 0 && mat[i][j - 1] == 1) isIsland = false;
                    // Right
                    if (j + 1 < N && mat[i][j + 1] == 1) isIsland = false;

                    if (isIsland) {
                        count++;
                    }
                }
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }
}
