package ex_16_Arrays;

public class Lab157_sum_of_Arrays {
    public static void main(String[] args) {
        int[] arr = {3,2,6,10,0,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}
