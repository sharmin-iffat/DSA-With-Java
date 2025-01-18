package Array;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter array of "+ n + " elemnts ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            sc.close();
        }
    }   
}
