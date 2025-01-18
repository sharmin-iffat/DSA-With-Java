package Array;

import java.util.Scanner;

public class FindUnique {
    static int findUniqueElement(int[] arr) {
        int uniqueElement = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                uniqueElement = arr[i];
            }
        }
        return uniqueElement;
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
        System.out.print("Unique Elements are " + findUniqueElement(arr));
        input.close();
    }
}
