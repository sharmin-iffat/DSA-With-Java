package Array;

public class PrefixSumInplace {
    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        arr = makePrefixSumArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
