package ex_19_Abstraction;

public class Lab180_Abstraction_ex1 {
    public static void main(String[] args) {

        Dog a = new Dog();
        a.makeSound();

        Cat b = new Cat();
        b.makeSound();

    }
}
abstract class Animal{
    abstract void makeSound();   //abstract method

    void eat(){
        System.out.println("This Animal eat food");
    }
}
class Dog extends Animal {
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void makeSound(){
        System.out.println("Cat Meows");
    }
}
