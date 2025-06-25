package Task_For_Loop;

public class Print_the_multiplication_table_of_5 {
    public static void main(String[] args) {

        int number = 5;
        System.out.println("Multiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
