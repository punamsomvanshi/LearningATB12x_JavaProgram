package ex_18_OOPs_Constructors;


class StudentB {
    String name;
    int age;

    // Parameterized Constructor
    StudentB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    StudentB(StudentB s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        StudentB s1 = new StudentB("Punam Somvanshi", 27);
        StudentB s2 = new StudentB(s1); // Using copy constructor
        s2.display();
    }
}
