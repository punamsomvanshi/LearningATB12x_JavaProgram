package Tasks;

import java.util.Scanner;

public class Task_05_Vowels_Consonant_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string in which you want to find no. of vowels and consonants : ");
        String string = scanner.next();
        int len = string.length();
        int vowels = 0;
        int cons = 0;

        for (int i = 0; i < len; i++) {
            char ch = string.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    cons++;
            }
        }
        System.out.println("Number of vowels in " + string + " ->" + vowels);
        System.out.println("Number of consonants in " + string + " ->" + cons);

    }
}
