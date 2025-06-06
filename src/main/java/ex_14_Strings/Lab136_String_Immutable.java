package ex_14_Strings;

public class Lab136_String_Immutable {
    public static void main(String[] args) {
        String st1="HELLO";
        st1.toLowerCase(); //Another string in String constant pool will be created and hello will be stored but st1 will still point to HELLO
        System.out.println(st1);
    }
}
