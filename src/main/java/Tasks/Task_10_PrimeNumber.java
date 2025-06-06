package Tasks;
import java.util.Scanner;

public class Task_10_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (isPrime(num))
                System.out.println("Number is Prime");
            else
                System.out.println("Number is not Prime");
        }
        else System.out.println("enter a valid number");
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
