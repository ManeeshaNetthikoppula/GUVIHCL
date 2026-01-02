import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class tillzero{
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int zeroCount = 0;
        Boolean printing = false;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == 0){
                zeroCount++;
                if(zeroCount == 2){
                    break;
                }
                printing = true;
                continue;
            }
            if(printing && zeroCount == 1){
                result.append(num).append(" ");
            }
        }
        if(zeroCount < 2 || result.length() == 0 ){
            System.out.print(-1);
        }
        else{
            System.out.print(result.toString().trim());
        }
    }
}

