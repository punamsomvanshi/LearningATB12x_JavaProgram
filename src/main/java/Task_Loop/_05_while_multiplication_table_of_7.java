package Task_Loop;

public class _05_while_multiplication_table_of_7 {
    public static void main(String[] args) {
        int i = 1;
        int number = 7;
        System.out.println("Multiplication Table of " + number + " : ");

        while (i <= 10){
            System.out.println(number + " X " + i + " = " + (number * i));
            i++;
        }
    }
}
