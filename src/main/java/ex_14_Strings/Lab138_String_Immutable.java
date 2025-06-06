package ex_14_Strings;

public class Lab138_String_Immutable {
    public static void main(String[] args) {
        String st1="Hello";
        st1.concat(" World");
        System.out.println(st1);
        st1=st1.concat(" World");
        System.out.println(st1);
    }
}
