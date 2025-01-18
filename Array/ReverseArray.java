package Array;

public class ReverseArray {
    static int[] reverseArray(int [] arr){
        int [] rev_arr = new int [arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            rev_arr [j++] = arr[i];
        }
        return rev_arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] rev_arr = reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println( rev_arr[i] + " ");
        }
    }
}
