package Tasks;

public class Task_13_OddEvenNumberInArray {
    public static void main(String[] args) {
        int[] arr={4,6,1,9,3,10,8,14,25,32,7};

        for(int i =0;i< arr.length;i++){
            if(arr[i]%2==0)
                System.out.println(arr[i] + " is even");
            else
                System.out.println(arr[i]+ " is odd");

        }

    }
}
