package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _06_LargestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter a second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter a Third Number : ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("The Largest Number is : " + num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("The Largest Number is : " + num2);
        }else {
            System.out.println("The Largest Number is : " + num3);
        }
        sc.close();
    }
}
