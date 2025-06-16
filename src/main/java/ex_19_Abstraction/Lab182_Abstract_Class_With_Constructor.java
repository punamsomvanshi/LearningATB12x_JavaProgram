package ex_19_Abstraction;

public class Lab182_Abstract_Class_With_Constructor {
    public static void main(String[] args) {

        SubClass obj = new SubClass();    // Creating object of subclass
        obj.DisplayMessage();     // Calling method from abstract class

    }
}

//abstract class
abstract class AbstractDemo{
    // Constructor of abstract class
    AbstractDemo(){
        System.out.println("Abstract class constructor called");
    }

    //Regular method
    void DisplayMessage(){
        System.out.println("Method from abstract class");
    }
}
class SubClass extends AbstractDemo{
    // // No additional constructor or method needed for this example

}

