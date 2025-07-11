package ex_20_Static;

public class Lab190_Static3 {
    public static void main(String[] args) {

        A a=new A();
        A.m1();
        System.out.println(A.a);

    }
}
class A {
    static {
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");
    }

    static int a = 10;

    static void m1() {
        System.out.println("static functionc");
    }
}
