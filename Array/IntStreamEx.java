package Array;

import java.util.stream.IntStream;

public class IntStreamEx {
    public static void main(String[] args) {
        int sumOfEvents = IntStream.range(1,10).filter(x->x %2 ==0).sum();
        System.out.println("Sum of even numbers : " + sumOfEvents);
    }
}
