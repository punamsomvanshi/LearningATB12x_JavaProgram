package ex_18_OOPs_Constructors;

public class Lab175_Default_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Punam";
        age = 27;
    }

    void display() {
        System.out.println(" Name : " + name);
        System.out.println(" Age : " + age);
    }
}


