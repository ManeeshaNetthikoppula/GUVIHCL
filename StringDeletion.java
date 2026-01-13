import java.util.Scanner;

public class StringDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String X = sc.nextLine();
        if (S.contains(X)) {
            S = S.replaceFirst(X, "").trim();
        }

        System.out.println(S);
    }

    
}
