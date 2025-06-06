package ex_16_Arrays;

import java.util.Scanner;

public class Lab155_Array_User_Inputs {
    public static void main(String[] args) {
        System.out.println("Enter the array length");
        Scanner scanner= new Scanner(System.in);
        int length=scanner.nextInt();
        int[] marks= new int[length];
        for ( int i=0; i<length;i++){
            System.out.println("Enter element "+i);
            marks[i]=scanner.nextInt();
        }
        System.out.print("You entered this array->  [ ");
        for ( int i=0; i<length;i++){

            System.out.print(marks[i] + ", ");

        }
        System.out.print("]");
        scanner.close();
    }
}
