package Tasks;

public class Task_08_Max_in_3_Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        int c=300;
        System.out.print("Biggest Number is -> ");
        System.out.println(a>b ? (a>c?a:c) : (b>c?b:c));

    }
}
