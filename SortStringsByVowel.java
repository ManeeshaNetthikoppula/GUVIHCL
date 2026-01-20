import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortStringsByVowel {
    static int countVowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.next());
        }
        list.sort((a, b) -> countVowels(b) - countVowels(a));

        for (String s : list) {
            System.out.println(s);
        }
    }
    
}
