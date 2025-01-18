package Array;
import java.util.Scanner;

public class noOfOcc {
    static int countOccurance(int [] arr , int x){
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the size of array : ");
        int n = input.nextInt();

        int [] arr = new int [n];
        System.out.print("Enter " + n + " elements : ");

        for (int i=0; i< arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter x : ");
        int x = input.nextInt();

        System.out.print(countOccurance(arr, x) + " x are occure in given array");
        input.close();
    }
    
}
