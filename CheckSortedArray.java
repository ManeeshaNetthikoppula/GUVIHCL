import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr =  new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        boolean ascending = true;
        boolean descending = true;
        for(int i = 0; i < N - 1;i++){
            if(arr[i] > arr[i+1]){
                ascending = false;
            }
            if(arr[i] < arr[i+1]){
                descending = false;
            }
        }
        if(ascending || descending){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }  
}
