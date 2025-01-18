package Array;

import java.util.Scanner;

public class ReturnFirstRepeating {
    static int repeatingValue(int[] arr){
        int rtValue = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    rtValue = arr[i];
                }
            }
        }
        return rtValue;
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

        System.out.print("Repeating Value is  " + repeatingValue(arr));
        input.close();
    }
    
}
