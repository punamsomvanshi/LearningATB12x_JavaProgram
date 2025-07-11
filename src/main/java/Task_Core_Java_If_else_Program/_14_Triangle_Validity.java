package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _14_Triangle_Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side A: ");
        int a = sc.nextInt();

        System.out.print("Enter side B: ");
        int b = sc.nextInt();

        System.out.print("Enter side C: ");
        int c = sc.nextInt();

        if(a + b > c && b + c > a && c + a > b){
            System.out.println("The triangle is valid.");
        }else{
            System.out.println("The triangle is not valid.");
        }
        sc.close();
    }
}
