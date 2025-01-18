package Array;
import java.util.Scanner;

public class StrictlyGreater { 
    static int countStrGre(int[] arr, int x) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (x < arr[i]) {
                    count = i;
                }
            }
            return count;
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

            System.out.print (countStrGre(arr, x) +" elemtents are strictly greater than x. " );
            input.close();
        }
    }
