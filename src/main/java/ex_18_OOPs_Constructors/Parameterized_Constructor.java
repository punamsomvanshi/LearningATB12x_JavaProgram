package ex_18_OOPs_Constructors;

public class Parameterized_Constructor {
    public static void main(String[] args) {

        student s1 = new student("Punam", 27);
        s1.display();
    }
}
class student {
    String name;
    int age;

    // Parameterized Constructor
    student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


