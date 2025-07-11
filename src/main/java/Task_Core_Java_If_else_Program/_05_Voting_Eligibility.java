package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _05_Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else if (age >= 0){
            System.out.println("You are not eligible to vote");
        }else{
            System.out.println("Invalid age entered");
        }
        sc.close();
    }
}
