package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _07_Smallest_of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        if(num1 < num2){
            System.out.println("The smallest Number is : " + num1);
        }else if(num2 < num1){
            System.out.println("The Smallest Number is : " + num2);
        }else{
            System.out.println("Both Numbers are equal.");
        }
        sc.close();
    }
}
