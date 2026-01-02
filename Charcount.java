import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Charcount{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] parts = input.split( " ");
        String s = parts[0];
        char k = parts[1].charAt(0);
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == k){
                count++;
            }
        }
        if(count == 0){
            System.out.print(-1);
        }
        else{
            System.out.print(count);
        }
        
    }
}