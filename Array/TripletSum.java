package Array;

import java.util.Scanner;

public class TripletSum {
    static int noOfTripletSum(int[] arr, int x) {
        int noOfTriplets = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        noOfTriplets++;
                    }
                }
            }
        }
        return noOfTriplets;
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

        System.out.print("No. of triplets are " + noOfTripletSum(arr, x));
        input.close();
    }

}
