package Array;

import java.util.Arrays;

public class DivideIntoEqualPair {
    static void printArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean divideArray(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[++i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,4,2,4};

        printArray(arr);
        System.out.println(divideArray(arr));
    }

}
