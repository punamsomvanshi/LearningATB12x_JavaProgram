package ex_04_Operators;

public class Lab41_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_punam = 26;
        int age_swastik = 29;

        boolean result = age_swastik >= age_punam;
        System.out.println(result);

        // age_swastik > age_punam or age_swastik = age_punam
    }
}

