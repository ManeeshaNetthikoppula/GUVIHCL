import java.util.Scanner;

public class DateFormatValidation {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        if(isValidDate(date)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    static boolean isValidDate(String date){
        if(!date.matches("\\d{2}/\\d{2}/\\d{4}")){
            return false;
        }
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        if(month < 1||month>12){
            return false;
        }
        int[] daysInMonth = {
            31, isLeapYear(year)? 29 : 28, 31,30,31,30,31,31,30,31,30,31
        };
        return day >= 1 && day <= daysInMonth[month - 1];
    }
    static boolean isLeapYear(int year){
        return(year % 400 ==0) || (year % 4 == 0 && year % 100 !=0);
    }
    
}
