package ex_18_OOPs_Constructors;


// Parent class
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

// Child class
class Car1 extends Vehicle {
    Car1() {
        System.out.println("Car constructor called");
    }
}

// Main class
public class Lab176_Default_Constructors_in_Inheritance {
    public static void main(String[] args) {
        Car1 c = new Car1(); // Creating object of child class
    }
}
