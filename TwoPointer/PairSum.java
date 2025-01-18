import java.util.Arrays;

public class PairSum {
    static int pairSum(int[] arr, int target){
        Arrays.sort(arr);
        int count=0;
        int left=0;
        int right= arr.length -1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum < target){
                count+= right-left;
                left++;
            }else{
                right--;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,8,3,4,7,6,5};
        int target = 7;
        System.out.println("Number of Pair Sum less than target is " + pairSum(arr, target));
    }
}
