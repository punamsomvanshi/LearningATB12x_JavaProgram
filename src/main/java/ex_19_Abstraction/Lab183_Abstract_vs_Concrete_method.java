package ex_19_Abstraction;

public class Lab183_Abstract_vs_Concrete_method {
    public static void main(String[] args) {
        // Create object of Child class
        Child obj = new Child();

        // Call both methods
        obj.Display(); // concrete method from abstract class
        obj.show();    // abstract method implemented in child class
    }

}
        // abstract class
        abstract class Parent{

            abstract void show();       // Abstract method (must be implemented by subclass)

            void Display(){      // Concrete method
                System.out.println("Concrete method in abstract class");
            }
        }

        // Subclass that extends abstract class
        class Child extends Parent{
            void show(){           // Implementing the abstract method
                System.out.println("Abstract method implemented");
            }
        }