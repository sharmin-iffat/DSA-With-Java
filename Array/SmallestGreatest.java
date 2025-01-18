package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestGreatest {
    static int[] smallestAndGreatest(int [] arr){
        Arrays.sort(arr);
        int [] newArray = {arr[0] , arr[arr.length-1]};
        return newArray;

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
        int [] newArray = smallestAndGreatest(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr[arr.length-1]);
        System.out.println(" Array with first element is smallest and last is greatest : " + newArray);
        input.close();
    }
}
