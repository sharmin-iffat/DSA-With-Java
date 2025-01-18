package Array;
import java.util.Scanner;

public class LastOccurence {
     static int lastOccurence(int [] arr , int x){
            int lastIndex = -1;
            for(int i=0; i< arr.length; i++){
                if(arr[i] == x){
                    lastIndex = i;
                }
            }
            return lastIndex;
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
    
            System.out.print( "Last index of x is " + lastOccurence(arr, x));
            input.close();
        }
        
    }
