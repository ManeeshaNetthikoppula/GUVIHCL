import java.util.Scanner;

public class VowelThenConsonent {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.append(c);
            } else {
                consonants.append(c);
            }
        }

        System.out.println(vowels.toString() + consonants.toString());
    }
    
}
