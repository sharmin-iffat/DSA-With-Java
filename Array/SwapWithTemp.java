package Array;

public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 5;
        int b=3;
        System.out.println("Value before swapping");
        System.out.println(" a : " + a);
        System.out.println(" b : "+ b);

        int temp = a;
        a=b;
        b=temp;
        System.out.println("Value after swapping");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);

    }
}
