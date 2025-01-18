package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemDupInPlace {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5 };
        int [] uni_arr =removeDuplicates(arr);
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Array without duplicates : " + Arrays.toString(uni_arr));

    }
    static int[] removeDuplicates(int[] arr){
        return IntStream.of(arr).distinct().toArray();
    }
}
