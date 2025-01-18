
public class SortEvenAndOdd {
    // Input- 2, 5, 3, 4,6,7,8,9,4
    // output-2,4,8,4,6,7,3,9,5
    //order of sorting does not matter
    static int[] sort(int[] arr){
        // Arrays.sort(arr);
        int left=0; 
        int right=arr.length-1;
        while (left<right) {
            if(arr[left] % 2 !=0 && arr[right] %2 ==0){
                swip(arr, left, right);
                left++;
                right--;
            } else if(arr[left] % 2 ==0 ){
                left++;
            }
            else if(arr[right] % 2 !=0 ){
                right--;
            }
        }
        return arr;
    }
    static void swip(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right] = temp;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {2, 5, 3, 4,6,7,8,9,4};
        sort(arr);
        printArray(arr);
    }
}
