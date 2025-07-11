package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _12_Prime_Number_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        boolean isPrime = true;     // Assume it's prime by default

        if(num <= 1){
            isPrime = false;    // 0 and 1 are not prime numbers
        }else{
           int i = 2;

           while(i <= num / 2){
               if (num % i == 0) {
                   isPrime = false;
                   break;
           }
               i++;
           }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }

        sc.close();
    }
}


