package Task_Loop;

public class _04_Sum_Number {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum );
    }
}
