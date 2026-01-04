import java.util.Scanner;

public class Evenfactorsofanum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean hasEvenFactor = false;
        StringBuilder result = new StringBuilder();
        for(int i = 2; i <= N; i += 2){
            if(N % i == 0){
                result.append(i).append(" ");
                hasEvenFactor = true;
            }
        }
        if(hasEvenFactor){
            System.out.print(result.toString().trim());
        }
        else{
            System.out.print("-1");
        
        }
    }
    
}
