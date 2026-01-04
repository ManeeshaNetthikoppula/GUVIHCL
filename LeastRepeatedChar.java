import java.util.*;
public class LeastRepeatedChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            if(c != ' '){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int val : map.values()){
            min = Math.min(min,val);
        }
    StringBuilder result = new StringBuilder();
    for(Map.Entry<Character, Integer> entry : map.entrySet()){
        if(entry.getValue() == min){
            result.append(entry.getKey());
        }
    }
    System.out.println(result.toString());
}
}