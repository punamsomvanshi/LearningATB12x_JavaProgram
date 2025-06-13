package ex_18_OOPs_Constructors;


class StudentID {
    String name;
    int age;

    // Default Constructor
    StudentID() {
        name = "Default";
        age = 0;
    }

    // Parameterized Constructor
    StudentID(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class Constructor_Overloading {
    public static void main(String[] args) {

        StudentID s1 = new StudentID();
        StudentID s2 = new StudentID("Punam Somvanshi", 27);
        s1.display();
        s2.display();
    }
}


