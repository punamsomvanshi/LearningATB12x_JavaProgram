package ex_19_Abstraction;

public class Lab185_Interface_with_Default_and_Static_Method {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();   // Call default method
        Vehical.fualType();   // Call static method using interface name

    }
}
// Interface with default and static methods
interface Vehical{

    // default method
    default void start(){
        System.out.println("Vehical Started");
    }

    // static method
    static void fualType(){
        System.out.println("Fual Type is Petrol");
    }
}

// class implementing the interface
class Car implements Vehical{

}


