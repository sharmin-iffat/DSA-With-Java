package Array;

import java.util.Scanner;

public class PairSum {
    static int noOfPairSum(int[] arr, int x) {
        int noOfPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    noOfPairs++;
                }
            }
        }
        return noOfPairs;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter x : ");
        int x = input.nextInt();

        System.out.print("Last index of x is " + noOfPairSum(arr, x));
        input.close();
    }

}
