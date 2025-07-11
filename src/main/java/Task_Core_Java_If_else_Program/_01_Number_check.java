package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _01_Number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Create Scanner Object

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();           // Read an integer from user

        if (num > 0){
            System.out.println("The Number is Positive.");
        }else if (num < 0){
            System.out.println("The Number is Negative.");
        }else{
            System.out.println("The Number is Zero.");
        }
        sc.close();     //close the scanner
    }
}
