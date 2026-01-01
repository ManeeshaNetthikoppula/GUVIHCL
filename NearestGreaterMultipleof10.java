import java.util.Scanner;

public class NearestGreaterMultipleof10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int result = ((N / 10) + 1) * 10;
        System.out.print(result);
    }
}

    
