package Tasks;
import java.util.Scanner;

public class Task_07_Minor_Sn_Adult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age=scanner.nextInt();
        String Result = age>18 ? (age>65 ? "Senior" : "Adult") : "Minor";
        System.out.println(Result);
    }
}
