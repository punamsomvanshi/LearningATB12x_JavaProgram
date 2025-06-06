package ex_16_Arrays;

public class Lab163_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] arr_2d={
                {1,2,3},
                {4,5,6},
                {6,8,9}
        };
        for (int i = 0;i<arr_2d.length;i++)
        {
            for( int j =0;j< arr_2d.length;j++)
                System.out.print(arr_2d[i][j]);
        }
        System.out.println();
        for (int i = 0;i<arr_2d.length;i++)
        {
            for( int j =0;j< arr_2d.length;j++)
                System.out.print("*");
            System.out.println("");
        }

    }
}
