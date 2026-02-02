import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RightAngledTrianleof1s {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
                if (j < i) {
                    System.out.print(" ");
                }
            }
            if (i > 1) {
                System.out.println();
            }
        }
    }
    
}
