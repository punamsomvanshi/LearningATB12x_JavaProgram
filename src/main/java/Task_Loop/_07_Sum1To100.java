package Task_Loop;

public class _07_Sum1To100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Numbers from 1 To 100 is : " + sum);
    }
}
