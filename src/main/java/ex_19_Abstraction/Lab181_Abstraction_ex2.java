package ex_19_Abstraction;

public class Lab181_Abstraction_ex2 {

    public static void main(String[] args) {
        // Creating objects of SBI and HDFC
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        // Printing interest rates
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}

// Abstract class Bank
abstract class Bank {
    // Abstract method to get interest rate
    abstract double getInterestRate();
}

// SBI class extends Bank
class SBI extends Bank {
    // Implementation of abstract method
    double getInterestRate() {
        return 6.5;
    }
}

// HDFC class extends Bank
class HDFC extends Bank {
    // Implementation of abstract method
    double getInterestRate() {
        return 7.0;
    }
}

