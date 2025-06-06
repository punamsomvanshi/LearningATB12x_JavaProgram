package Tasks;

public class Task_15_SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr={6,4,7,2,9};
        int min=arr[1];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println("min= " +min);
    }
}
