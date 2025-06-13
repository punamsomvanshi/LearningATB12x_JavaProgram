package ex_17_OOPs;

public class Multiple_Inheritance {
    public static void main(String[] args){

        Car c = new Car();
        c.start();
        //c.roll();
    }
}

interface Engine{
    void start();
    }
interface Wheels{
    void roll();
}

class car implements Engine, Wheels{
    public void start(){
        System.out.println("Car Engine Start");
    }

    public void roll(){
        System.out.println("Car Wheels Rolling");
    }
}

