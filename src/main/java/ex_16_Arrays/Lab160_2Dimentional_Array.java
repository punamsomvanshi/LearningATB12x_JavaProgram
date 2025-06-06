package ex_16_Arrays;

public class Lab160_2Dimentional_Array {
    public static void main(String[] args) {
        int[][] arr_2D ={
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };
        int[][] array;
        array = new int[][] { {10, 20}, {30, 40}, {50, 60} };
        // 10,20
        // 30,40
        // 50,60 3x2

        // R ->  3
        // C -> 3
        int[][] array_2d = new int[3][3];
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;
//        array_2d[0][3] = 92;

        array_2d[1][0] = 1;
        array_2d[1][1] = 3;
        array_2d[1][2] = 5;

        array_2d[2][0] = 2;
        array_2d[2][1] = 4;
        array_2d[2][2] = 6;
    }
}
