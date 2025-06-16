package ex_19_Abstraction;

public class Lab187_Interface_Polymorphism {
    public static void main(String[] args) {

        // Interface reference
        Playable playable;

        // Assign Guitar to interface reference
        playable = new Guitar();
        playable.play();     // Output: Playing Guitar

        // Assign Piano to same reference
        playable = new Piano();
        playable.play();     // Output: Playing Piano
    }
}

// Interface with one method
interface Playable{
    void play();
}

// Class implementing Playable
class Guitar implements Playable{
    public void play(){
    System.out.println("Playing Guitar");
    }
}

// Another class implementing Playable
class Piano implements Playable{
   public void play(){
        System.out.println("Playing Piano");
    }
}
