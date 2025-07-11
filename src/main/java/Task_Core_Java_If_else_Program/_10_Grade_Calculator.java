package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _10_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Step 1: Scanner for input

        System.out.println("Enter your marks (0-100) : ");
        int marks = sc.nextInt();

        // Step 2: Check validity
        if(marks < 0 && marks > 100){
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }else{
            // Step 3: Grade calculation
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: D");
            } else if (marks >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: Fail");
            }
        }

        sc.close();  // Close the scanner
    }
}

