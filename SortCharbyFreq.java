import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortCharbyFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freqMap.keySet());
        chars.sort((c1, c2) -> {
            int freqCompare = freqMap.get(c2) - freqMap.get(c1); 
            if (freqCompare == 0) {
                return c1 - c2; 
            }
            return freqCompare;
        });
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            int count = freqMap.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
    
}
