package ex_19_Abstraction;

public class Lab186_Interface_Constants {
    public static void main(String[] args) {
        Carx car = new Carx();
        car.ShowSpeedLimit();
    }
}

// Interface with a constant
interface SpeedLimit {
    int MAX_SPEED = 120;
}

// Class that uses the interface constant
class Carx implements SpeedLimit{

    void ShowSpeedLimit(){
        // Accessing the constant from the interface
        System.out.println("MAX Speed is : " + MAX_SPEED);
    }
}
