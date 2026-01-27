import java.util.Scanner;

public class RemoveExtraSpacesainAString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the entire line (important!)
        String input = sc.nextLine();

        // Trim and replace multiple spaces with single space
        String result = input.trim().replaceAll("\\s+", " ");

        System.out.println(result);
    }
    
}
