package ex_19_Abstraction;

public class Lab184_Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {

        // Create object of Document
        Document obj = new Document();

        // Call methods from both interfaces
        obj.print();
        obj.show();
    }

}
        // Interface 1
        interface Printable{
            void print();
        }

        // Interface 2
        interface Showable{
            void show();
        }

        // Class implementing both interfaces
        class Document implements Printable, Showable{

            // Implementing print() from Printable
            public void print(){
                System.out.println("Printing Document");
            }

            // Implementing show() from Showable
            public void show(){
                System.out.println("Showing Document");
            }
        }