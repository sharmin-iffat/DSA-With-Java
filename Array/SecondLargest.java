package Array;

import java.util.Scanner;

public class SecondLargest {
    static int findMax(int [] arr){
        int max =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int [] arr){
        int max=findMax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
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
        System.out.print("Second maximum Element is " + findSecondMax(arr));
        input.close();
    }
}
