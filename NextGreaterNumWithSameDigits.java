import java.util.Scanner;

public class NextGreaterNumWithSameDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();  // read as string to handle very large numbers
        char[] arr = N.toCharArray();
        int n = arr.length;

        // Step 1: Find the first decreasing element from right
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            System.out.println("impossible");
            sc.close();
            return;
        }

        // Step 2: Find the element just larger than arr[i] from the right
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: Reverse the subarray from i+1 to end
        reverse(arr, i + 1, n - 1);

        // Print result
        System.out.println(new String(arr));
        sc.close();
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
