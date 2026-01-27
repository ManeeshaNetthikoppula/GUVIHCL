import java.util.Scanner;

public class SubStringCheck3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int index = s1.indexOf(s2);
        System.out.println(index);
    }
    
}
