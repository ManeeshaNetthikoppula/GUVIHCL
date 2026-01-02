import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountStringOccurrences {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        String s = br.readLine();
        int count = 0;
        int index = 0;
        while((index = sentence.indexOf(s,index)) !=-1) {
            count++;
            index = index + s.length();
        }
        if(count == 0){
            System.out.print(-1);
        }
        else{
            System.out.print(count);
        }
        
    }
}
    

