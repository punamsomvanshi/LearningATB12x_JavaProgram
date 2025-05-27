package ex_07_Increment_Decrement_Operator;

public class Lab80_IncDecOp_Task3 {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;// 1-2-3 m=-4

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
