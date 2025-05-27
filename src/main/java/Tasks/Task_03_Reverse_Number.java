package Tasks;

public class Task_03_Reverse_Number {
    public static void main(String[] args){

        int number = 12345;
        int reverse = 0;
        //  Using a for loop to reverse the number

        for(; number != 0; number = number / 10){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number: " + reverse);


    }
}
