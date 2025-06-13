package ex_17_OOPs;


// Parent class
class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class dog extends animal {
    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Method_Overriding_in_Inheritance {
    public static void main(String[] args) {
        animal a1 = new animal();  // Calls parent class method
        a1.sound();

        dog d1 = new dog();        // Calls child class method
        d1.sound();

        animal a2 = new dog();     // Polymorphism: parent reference, child object
        a2.sound();                // Calls Dog's overridden method
    }
}
