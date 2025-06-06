package Tasks;

public class Task_16_SumOfArray {
    public static void main(String[] args) {
        int[] arr= {4,7,10,2,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        };
        System.out.println("sum of array = " + sum);
    }
}
