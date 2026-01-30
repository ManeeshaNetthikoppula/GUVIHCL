import java.util.Scanner;

public class ReverseOddPositionedWords {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        String[] words = S.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            // Odd position in 1-based index = even index in 0-based
            if (i % 2 == 0) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        
        System.out.println(String.join(" ", words));
    }
    
}
