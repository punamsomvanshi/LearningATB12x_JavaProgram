package Tasks;

import java.util.Scanner;

public class Task_11_Fibonacci_series {
    public static void main(String[] args) {
        System.out.println("Enter the number till where you want to print Fibonacci series");
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt())
        {
            int a=1,b=2,c=0;
            int num=scanner.nextInt();
            for (int i=1;i<=num;i++)
            {
                c=a+b;
                a=b;
                b=c;
                System.out.println(c);

            }
        }
        else System.out.println("Invalid number!");
    }
}
