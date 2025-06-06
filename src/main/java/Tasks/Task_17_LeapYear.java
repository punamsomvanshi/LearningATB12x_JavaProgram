package Tasks;
import java.util.Scanner;

public class Task_17_LeapYear {
    public static void main(String[] args) {
        System.out.println("enter the year to identify if it's leap year or not!");
        Scanner scanner=new Scanner(System.in);

        if(scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is leap year!");
            } else
                System.out.println("Not a leap year!");
        }
        else System.out.println("Invalid entry");
    }
}
