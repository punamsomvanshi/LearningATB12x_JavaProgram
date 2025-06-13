package ex_18_OOPs_Constructors;


// Parent class
class Person {
    Person(String name) {
        System.out.println("Person constructor called: " + name);
    }
}

// Child class
class Employee extends Person {
    Employee(String name, int id) {
        super(name); // Calling parent constructor with parameter
        System.out.println("Employee constructor called: ID = " + id);
    }
}

// Main class
public class Parameterized_Constructors_with_super {
    public static void main(String[] args) {
        Employee emp = new Employee("Punam", 101);
    }
}
