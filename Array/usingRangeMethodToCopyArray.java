package Array;
import java.util.Arrays;

public class usingRangeMethodToCopyArray {
    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {5,6,7,3,8,9};
        System.out.print("Original Array : ");
        printArray(arr);

        int [] arr_2 = Arrays.copyOfRange(arr , 1 ,4);
        System.out.print("Copied Array : ");
        printArray(arr_2);

        
    }
    
}