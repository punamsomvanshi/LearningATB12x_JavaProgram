package Task_Core_Java_If_else_Program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _03_MaxofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("The Maximum Number is : " + num1);
        }else if (num2 > num1){
            System.out.println("The Maximum Number is : " + num2);
        }else{
            System.out.println("Both Numbers are equal.");
        }
        sc.close();
    }
}
