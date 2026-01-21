import java.util.Scanner;

public class CeaserCyperencryption {
     public static char shiftChar(char c, int shift) {
        if (Character.isUpperCase(c)) {
            return (char) ('A' + (c - 'A' + shift) % 26);
        } else if (Character.isLowerCase(c)) {
            return (char) ('a' + (c - 'a' + shift) % 26);
        } else {
            return c; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int lastSpace = input.lastIndexOf(' ');
        String s = input.substring(0, lastSpace);
        int shift = Integer.parseInt(input.substring(lastSpace + 1));

        StringBuilder encrypted = new StringBuilder();

        for (char c : s.toCharArray()) {
            encrypted.append(shiftChar(c, shift));
        }

        System.out.println(encrypted.toString());
    }
    
}
