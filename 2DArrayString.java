import java.util.Scanner;
public class 2DArrayString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();
        String text = "WELCOMETOGUVICORPORATIONS";
        char[][] matrix = new char[5][5];
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = text.charAt(idx++);
            }
        }

        int len = pattern.length();
        boolean found = false;
        for (int i = 0; i < 5 && !found; i++) {
            for (int j = 0; j <= 5 - len; j++) {
                int k;
                for (k = 0; k < len; k++) {
                    if (matrix[i][j + k] != pattern.charAt(k)) {
                        break;
                    }
                }
                if (k == len){
                    System.out.println(i + " " + j);
                    System.out.println(i + " " + (j + len - 1));
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println(0);
        }
    }
    
}
