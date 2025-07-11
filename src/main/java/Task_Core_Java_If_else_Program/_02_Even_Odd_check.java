package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _02_Even_Odd_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("The Number is Even.");
        }else{
            System.out.println("The Number is Odd.");
        }
        sc.close();
    }
}
