package ex_16_Arrays;

public class Lab158_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] arr ={98,29,40,45,2,0,10};
        int secHighest = 0;
        int highest = 0;
        int temp=0;
        for(int ele : arr){
            if(ele>highest){
                secHighest=highest;
                highest=ele;
            }
            else if (ele > secHighest && ele != highest) {

                secHighest = ele;
            }

        }
        System.out.println(secHighest);
    }
}
