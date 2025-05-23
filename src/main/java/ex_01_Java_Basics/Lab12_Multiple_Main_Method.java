package ex_01_Java_Basics;

public class Lab12_Multiple_Main_Method {

        public static void main(String[] args) {
            System.out.println("Multiple main");
        }

        public static void main(int args) {
            //This main method will not be recognised by Java
            System.out.println("Test"); //This will not get printed
        }

        public static void main(String args) {
            //This main method will not be recognised by Java
        }
}
