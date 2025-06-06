package ex_14_Strings;

public class Lab141_Strings_Interview {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        String s11 = "hello";


        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);

    }
}
