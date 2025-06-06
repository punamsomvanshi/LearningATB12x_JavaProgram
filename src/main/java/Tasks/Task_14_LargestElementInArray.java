package Tasks;

public class Task_14_LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={4,7,3,9,10,10,3,12};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("largest number in this array= " + max);
    }
}
