package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _11_Alphabet_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is a Alphabet");
        }else{
            System.out.println(ch + " is not an Alphabet");
        }
        sc.close();
    }
}
