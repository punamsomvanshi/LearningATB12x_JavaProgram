package ex_16_Arrays;
import java.util.Scanner;

public class Lab165_2D_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print");
        int n= scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
