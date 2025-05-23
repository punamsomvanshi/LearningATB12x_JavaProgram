package Tasks;

import java.util.Scanner;

public class Task_01_PrintTableOnlyUsingPrintF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number for which you want to create table : ");
        int n = scanner.nextInt();
        System.out.printf("%d x 1 = %d",n,n);
        System.out.printf("\n%d x 2 = %d",n,n*2);
        System.out.printf("\n%d x 3 = %d",n,n*3);
        System.out.printf("\n%d x 4 = %d",n,n*4);
        System.out.printf("\n%d x 5 = %d",n,n*5);
        System.out.printf("\n%d x 6 = %d",n,n*6);
        System.out.printf("\n%d x 7 = %d",n,n*7);
        System.out.printf("\n%d x 8 = %d",n,n*8);
        System.out.printf("\n%d x 9 = %d",n,n*9);
        System.out.printf("\n%d x 10 = %d",n,n*10);
    }


}
