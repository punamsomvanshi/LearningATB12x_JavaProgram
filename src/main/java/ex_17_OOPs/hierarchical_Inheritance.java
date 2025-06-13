package ex_17_OOPs;

public class hierarchical_Inheritance {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();

    }
}
        //parent class
        class Vehical{
            void start(){
                System.out.println("Vehical is starting");
            }
        }

        //child class 1
        class Car extends Vehical{
            void drive(){
                System.out.println("Car is driving");
            }
        }

        //child class 2
        class Bike extends Vehical{
            void ride(){
                System.out.println("Bike is riding");
    }
        }



