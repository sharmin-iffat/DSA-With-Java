package Array;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b=3;
        System.out.println("Value before swapping");
        System.out.println(" a : " + a);
        System.out.println(" b : "+ b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value after swapping");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);

    }
}
