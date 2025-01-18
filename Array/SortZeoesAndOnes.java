package Array;

import java.util.Scanner;

public class SortZeoesAndOnes {
    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left]= arr[right];
        arr[right] = temp;
    }
    static void sortArray(int [] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]== 0){
                left ++;
            }
            if(arr[right]== 1){
                right --;
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        sortArray(arr);
        printArray(arr);
        input.close();
        

        
    }
}
