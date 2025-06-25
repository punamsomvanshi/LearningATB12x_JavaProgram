package ex_18_OOPs_Constructors;


class StudentA {
    String name;
    int age;

    StudentA(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Lab179_Using_this_keyword_in_constructor {
    public static void main(String[] args) {
        StudentA s = new StudentA("Punam", 27);
        s.display();
    }
}
