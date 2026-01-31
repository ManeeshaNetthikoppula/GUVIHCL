import java.util.Scanner;
public class ReverseWordsInStrings {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        
        System.out.println(String.join(" ", words));
    }
    
}
