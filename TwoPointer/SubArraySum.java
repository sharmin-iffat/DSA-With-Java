import java.util.ArrayList;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> subArr = new ArrayList<>();
        
        int l=0, r=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if(sum >= target){
                r = i;
                while(sum > target){
                    sum -= arr[l];
                    ++l;
                }
                if(sum == target){
                   
                    subArr.add(l+1);
                    subArr.add(r+1);
                    return subArr;
                }
                
            }
            
        }
        subArr.add(-1);
        return subArr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 4};
        int target = 2;
        System.out.println("Sub Array is " + subarraySum(arr, target) );

    }
}
