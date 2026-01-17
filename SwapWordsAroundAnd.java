import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapWordsAroundAnd {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();

        String[] words = line.split(" ");

        for (int i = 1; i < words.length - 1; i++) {
            if (words[i].equals("and")) {
                
                String temp = words[i - 1];
                words[i - 1] = words[i + 1];
                words[i + 1] = temp;
            }
        }

        System.out.println(String.join(" ", words));
    }
    
}
