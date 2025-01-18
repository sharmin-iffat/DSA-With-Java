public class SortZeroesAndOnes {
    static int[] sort(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left] > arr[right]){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else if(arr[left] == 0){
                left++;
            }else{
                right--;
            }
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0,1,1,0,0,0};
        sort(arr);
        printArray(arr);
        
    }
    
}
