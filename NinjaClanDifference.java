import java.util.Scanner;

public class NinjaClanDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int kabali = sc.nextInt();
            int opponent = sc.nextInt();

            int difference = Math.abs(opponent - kabali);
            System.out.println(difference);
        }

        sc.close();
    }
}

    

