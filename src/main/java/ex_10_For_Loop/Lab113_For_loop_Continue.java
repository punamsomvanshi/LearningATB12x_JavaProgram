package ex_10_For_Loop;

public class Lab113_For_loop_Continue {
    public static void main(String[] args) {
        //Print 1 tp 50 and skip 50
        for (int i=0;i<50;i++){
            if(i==5)
                continue;
            System.out.println(i);

        }
    }
}
