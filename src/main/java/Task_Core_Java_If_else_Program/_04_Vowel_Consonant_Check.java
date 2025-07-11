package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _04_Vowel_Consonant_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = sc.next().toLowerCase().charAt(0);   // Read first character and convert to lowercase

        if ((ch >= 'a' && ch <= 'z')){      // Check if it's an alphabet
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + "is a Vowel.");
            }else{
                System.out.println(ch + " is a Consonant.");
            }
            }else{
            System.out.println("Invalid input! Please enter an alphabet.");
        }
        sc.close();
    }
}
