import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Primepairsofanum {
    static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2;i * i <= num;i++){
            if(num % i == 0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> result = new ArrayList<>();
        for(int i = 2; i*i <=N; i++){
            if(N%i ==0){
                int j = N/i;
                if(isPrime(i) && isPrime(j)){ 
                    result.add(Math.max(i,j) + " " +Math.min(i,j));
                }
            }
        }
        if(result.isEmpty()){
            System.out.print("-1");
        }
        else{
            result.sort(Collections.reverseOrder());
            for(String pair : result) {
                System.out.print(pair + " ");
            }
        }
    }
    
}
