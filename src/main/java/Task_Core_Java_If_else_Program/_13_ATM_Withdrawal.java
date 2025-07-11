package Task_Core_Java_If_else_Program;

import java.util.Scanner;

public class _13_ATM_Withdrawal {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw : ");
        int amount = sc.nextInt();

        if(amount <= 0){
            System.out.println("Please enter an amount greater than 0.");
        }else if(amount % 100 != 0){
            System.out.println("Withdrawal amount must be a multiple of 100.");
        }else if(amount > balance){
            System.out.println("Insufficient balance.");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Your current balance is : " + balance);
        }
        sc.close();

    }
}
