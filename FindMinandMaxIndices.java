import java.util.Scanner;

public class FindMinandMaxIndices {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i + 1; // 1-based indexing
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIndex = i + 1; // 1-based indexing
            }
        }
        
        System.out.println(minIndex + " " + maxIndex);
        sc.close();
    }
    
}
