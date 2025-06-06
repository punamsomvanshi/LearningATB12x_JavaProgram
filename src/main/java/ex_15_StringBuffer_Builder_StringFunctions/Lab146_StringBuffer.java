package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("punam");
        sb.append(" somvanshi");
        System.out.println(sb);

        String s1="punam";
        s1=s1.concat(" somvanshi");
        System.out.println(s1);
    }
}
