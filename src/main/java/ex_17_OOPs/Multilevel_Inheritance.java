package ex_17_OOPs;

public class Multilevel_Inheritance {
    public static void main(String[] args){
        Manager m = new Manager ();
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}
//Grandparent class
class Person{
    String name = "Punam";

    void displayPerson(){
        System.out.println("Name : " + name);
    }
}

//parent class
class Employee extends Person {
    int EmployeeID = 101;

    void displayEmployee(){
        System.out.println("EmployeeID : " + EmployeeID );
    }
}

// child class
class Manager extends Employee{
    String Department = "IT";

    void displayManager(){
        System.out.println("Department : " + Department);
    }
}
