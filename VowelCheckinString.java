import java.util.Scanner;

public class VowelCheckinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        sc.close();
        
        if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u"))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

    