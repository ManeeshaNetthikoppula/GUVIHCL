import java.util.Scanner;
public class EqualizeStringLength{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int minLength = Math.min(s1.length(), s2.length());

        s1 = s1.substring(0, minLength);
        s2 = s2.substring(0, minLength);

        System.out.println(s1 + s2);
    }
}

    

