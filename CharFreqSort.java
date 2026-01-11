import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CharFreqSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            freqMap.put(num, freqMap.getOrDefault(num, 0 ) + 1);
        }
        List<Integer> list = new ArrayList<>(freqMap.keySet());
        Collections.sort(list, (a, b) ->{
            if(!freqMap.get(a).equals(freqMap.get(b))){
                return freqMap.get(b)-freqMap.get(a);
            }
            return b - a;
        });
        for( int num : list){
            System.out.print(num + " ");
        }
    }
    
}
