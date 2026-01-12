import java.util.Scanner;

public class DatetoMonthNameConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[1]);

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.println(months[month - 1]);
    }
    
}
