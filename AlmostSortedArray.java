import java.util.Scanner;

public class AlmostSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.println(findUpdateIndex(arr));
        }
        sc.close();
    }
    
    private static int findUpdateIndex(int[] arr) {
        int N = arr.length;
        int count = 0;
        int index = -1;
        
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                if (index == -1) index = i;
                else return -1; 
            }
        }
        
        if (count == 0) return -1; 
        
        
        if (index == 0 || index == N - 2) return index;
        if (arr[index - 1] <= arr[index + 1] || arr[index] <= arr[index + 2]) {
            return index;
        } else {
            return index + 1;
        }
    }
}

    

