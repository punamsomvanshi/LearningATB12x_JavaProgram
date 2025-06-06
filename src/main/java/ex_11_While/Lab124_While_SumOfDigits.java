package ex_11_While;

import java.util.Scanner;

public class Lab124_While_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) { // Loop until the number becomes 0
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);

    }
}
