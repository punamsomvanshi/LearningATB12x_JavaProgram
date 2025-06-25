package ex_17_OOPs;

// Parent class
class Animal {
    void makesound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class extending Animal
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void makesound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Lab170_Single_Inheritance {
    public static void main(String[] args) {

       Animal a = new Animal();    // Creating object of parent class
        a.makesound();              // Inherited method from Animal class

        Dog dog = new Dog();   // Creating object of child class
        dog.makesound();       // Own method of Dog class
    }
}