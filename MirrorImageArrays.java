import java.util.Scanner;
public class MirrorImageArrays {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean mirror = true;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[n - 1 - i]) {
                mirror = false;
                break;
            }
        }

        System.out.println(mirror ? "yes" : "no");

        sc.close();
    }
}