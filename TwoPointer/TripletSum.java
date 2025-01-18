// package TwoPointer;

import java.util.Arrays;

//this solution is not correct

public class TripletSum {
    static int solution(int[] arr, int target){
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length-2; i++){
            int j= i+1;
            int k = arr.length -1;
            while(j<k){
                int sum = arr[i]+ arr[j]+ arr[k];
                if(sum == target){
                    count++;
                    j++;
                    
                }else if (sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,5};
        int target = -2;  
        System.out.println("Number of triplet sums : " + solution(arr, target));
    }
}
