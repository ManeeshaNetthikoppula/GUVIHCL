import java.util.Scanner;

public class ReverseEachWord {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}

    
