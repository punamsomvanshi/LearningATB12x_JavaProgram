package ex_18_OOPs_Constructors;


// Parent class
class Animal {
    // Constructor of parent class
    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child class
class Dog extends Animal {
    // Constructor of child class
    Dog() {
        System.out.println("Dog constructor called");
    }
}

// Main class
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Creating Dog object
    }
}

