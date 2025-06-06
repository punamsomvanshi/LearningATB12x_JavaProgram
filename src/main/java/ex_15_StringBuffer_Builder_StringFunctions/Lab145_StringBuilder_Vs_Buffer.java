package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "punam";
        String s1 = new String("punam");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("punam");
        StringBuilder stringBuilder = new StringBuilder("punam");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
