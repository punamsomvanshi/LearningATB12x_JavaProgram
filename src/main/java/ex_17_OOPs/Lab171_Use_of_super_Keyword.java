package ex_17_OOPs;

// Parent class
class Personx {
    String name = "Unknown";

    void displayInfo() {
        System.out.println("Person Name: " + name);
    }
}

// Child class
class Student extends Personx {
    String name = "Punam";

    void displayInfo() {
        System.out.println("Student Name: " + name);
        super.displayInfo(); // Calling parent class method using super
    }
}

// Main class
public class Lab171_Use_of_super_Keyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
    }
}


