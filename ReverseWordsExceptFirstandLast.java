import java.util.Scanner;

public class ReverseWordsExceptFirstandLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");

        for (int i = 1; i < words.length - 1; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        System.out.println(String.join(" ", words));
    }
    
}
