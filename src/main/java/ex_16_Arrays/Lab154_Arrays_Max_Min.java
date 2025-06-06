package ex_16_Arrays;

public class Lab154_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] arr= {23,43,64,63,1,0,100};

        System.out.println("max in array= "+ max_in_array(arr));
        System.out.println("min in array= "+ min_in_array(arr));
    }
    public static int max_in_array(int[] arr){
        int max=0;
        for (int i =0; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int min_in_array(int[] arr){
        int max=0;
        for (int i =0; i<arr.length; i++)
        {
            if(arr[i]<max)
                max=arr[i];
        }
        return max;
    }
}
