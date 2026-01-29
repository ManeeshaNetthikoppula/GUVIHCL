import java.util.Scanner;

public class OptimalCurrencyDenomination {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] denominations = {1000, 500, 100, 50, 10, 1};
        int count = 0;

        for (int note : denominations) {
            if (amount >= note) {
                count += amount / note;
                amount = amount % note;
            }
        }

        System.out.println(count);
        sc.close();
    }
    
}
