import java.util.Scanner;
public class poweroftwocheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N > 0 && (N &(N -1)) == 0){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
    

