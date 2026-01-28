import java.util.Scanner;

public enum PrintSubStringsLengthofK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int K = sc.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= S.length() - K; i++) {
            result.append(S.substring(i, i + K));
            if (i != S.length() - K) {
                result.append(" ");
            }
        }

        System.out.print(result.toString());
    }
}
