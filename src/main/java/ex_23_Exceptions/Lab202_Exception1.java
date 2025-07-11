package ex_23_Exceptions;

public class Lab202_Exception1 {
    public static void main(String[] args) {
        System.out.println("Start");
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException
        int b = 100/a; // java.lang.ArithmeticException: / by zero

        System.out.println(b);
        System.out.println("End the program");
    }
}
