import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharinStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
    
}
