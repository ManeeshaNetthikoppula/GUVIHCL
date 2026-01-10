import java.util.Scanner;

public class WordPositioninString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String S = sc.nextLine();

        String X = sc.nextLine();

        String[] words = S.split(" "); 
        int position = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(X)) {
                position = i + 1; 
                break;
            }
        }

        System.out.println(position);
    }
}

    
