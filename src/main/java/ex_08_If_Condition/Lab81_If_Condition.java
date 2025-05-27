package ex_08_If_Condition;

public class Lab81_If_Condition {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]); //Taking input from CLI
        if(age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't vote!");
        }
    }
}
