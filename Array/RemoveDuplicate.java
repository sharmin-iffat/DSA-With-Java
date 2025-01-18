package Array;

import java.util.Arrays;

public class RemoveDuplicate {
    static int[] removeDuplicate(int[] arr) {
        int [] temp = new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            boolean duplicate = false;
            for(int k=0; k<i; k++){
                if(arr[i] == arr[k]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                temp[j++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5 };
        int [] uni_arr =removeDuplicate(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print( uni_arr[i] + " ");
        }

    }
}