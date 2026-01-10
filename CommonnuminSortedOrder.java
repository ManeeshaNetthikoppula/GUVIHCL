import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonnuminSortedOrder {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        for (int i = 0; i < N; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < M; i++) arr2[i] = sc.nextInt();

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < N && j < M) {
            if (arr1[i] == arr2[j]) {
            
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

    
