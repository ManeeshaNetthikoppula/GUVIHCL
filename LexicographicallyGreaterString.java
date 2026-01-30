import java.util.Scanner;

public class LexicographicallyGreaterString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        
        char[] arr = S.toCharArray();
        int n = arr.length;
        
        int i = n - 2;
        // Step 1: Find first character smaller than its next
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        
        if (i < 0) {
            System.out.println("-1");
            return;
        }
        
        // Step 2: Find smallest character greater than arr[i] to the right
        int j = n - 1;
        while (arr[j] <= arr[i]) j--;
        
        // Step 3: Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        // Step 4: Reverse the substring after i
        reverse(arr, i + 1, n - 1);
        
        System.out.println(new String(arr));
    }
    
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
