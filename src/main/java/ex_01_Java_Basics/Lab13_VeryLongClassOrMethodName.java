package ex_01_Java_Basics;

public class Lab13_VeryLongClassOrMethodName {
    public static void main(String[] args) {
        System.out.println("Main method calling another method in same class");
        Lab13_VeryLongClassOrMethodName.This_Is_Very_Long_Method_Name_Blah_Blah();
    }
    static void This_Is_Very_Long_Method_Name_Blah_Blah(){
        System.out.println("Inside This_Is_Very_Long_Method_Name_Blah_Blah Method");
    }
}
