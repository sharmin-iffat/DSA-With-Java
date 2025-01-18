package Array;
import java.util.Scanner;

public class CheckSorted {
    static boolean isSorted (int [] arr){
        boolean check = true;
        for(int i = 1; i<arr.length; i++){
            if (arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
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

            System.out.print ( "Given array is sorted : " + isSorted(arr));
            input.close();
        }
    
}
