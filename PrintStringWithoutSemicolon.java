import java.util.Scanner;

public class PrintStringWithoutSemicolon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        if (System.out.printf("%s", s) == null) {}
    }
}

    

