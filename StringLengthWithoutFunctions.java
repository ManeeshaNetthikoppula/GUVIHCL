import java.util.Scanner;

public class StringLengthWithoutFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        int length = 0;
        for (char c : S.toCharArray()) {  
            length++;
        }
        
        System.out.print(length);
    }
    
}
