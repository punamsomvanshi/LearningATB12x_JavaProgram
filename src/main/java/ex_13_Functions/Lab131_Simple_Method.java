package ex_13_Functions;

public class Lab131_Simple_Method {
    public static void main(String[] args) {

        //= no return type or void does not return any.
        non_return_type_func();

        String a = return_type_func();
        System.out.println(a);


    }

    // non return type function does not return anything, only printing.
    static void non_return_type_func(){
        System.out.println("Hi, Non Return Type");
    }


    // Return type function, it will return a particular data type.
    static  String return_type_func(){
        System.out.println("Hi,String Return Type");
        return "Punam";
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }

}
