import java.util.Scanner;

public class ConcecutiveStringCheck {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        boolean found = false;

        for (int i = 1; i < N; i++) {
            if (arr[i].equals(arr[i - 1])) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    
}
