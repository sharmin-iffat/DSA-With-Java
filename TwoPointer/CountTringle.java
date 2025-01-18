import java.util.Arrays;

public class CountTringle {
    static int countTringle(int [] arr){
        Arrays.sort(arr);
        int count =0;
        
    for(int i=arr.length-1; i>0; i--){
        int left = 0, right=i-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum > arr[i]){
                count+= right-left;
                right--;
            }else{
                left++;
                
            }
        }

    }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,21,22,100,101,200,300};
        System.out.println("No of Tringles " + countTringle(arr));
    }
}
