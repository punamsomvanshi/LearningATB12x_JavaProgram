package ex_12_DoWhile;

public class Lab127_Diff_While_DowhILE {
    public static void main(String[] args) {
        System.out.println("While");
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
        }
        System.out.println("do while");
        int b=0;
        do{
            System.out.println(b);
            b++;
        }while (b<5);
    }
}
