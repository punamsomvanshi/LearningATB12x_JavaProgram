package Tasks;

import java.util.Scanner;

public class Task_04_PalindromeOfString {
    public static void main(String[] args) {
        System.out.println("Enter the string to check if its palindrome");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        String revStr="";

        for (int i=str.length()-1;i>=0;i--)
        {
            char ch= str.charAt(i);
            revStr= revStr+String.valueOf(ch);
        }
        if(str.equals(revStr))
            System.out.println("String is palindrome");
        else System.out.println("String in not a palindrome");
    }
}
