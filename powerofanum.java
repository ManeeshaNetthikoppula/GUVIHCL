import java.util.Scanner;

public class powerofanum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        if(N < 1 || K < 2){
        System.out.println("no");
        return;
    }
    while(N % K ==0){
        N /= K;
    }
    if(N == 1) {
        System.out.print("yes");
    }
    else{
        System.out.print("no");
    }
    }
    
}
