public class CountPairSum {
    static int countPairs(int[] arr, int target){
        int count =0;
        int left=0, right=arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                count++;
                int temp1= left+1;
                int temp2 = right -1;
                while(temp1<right && arr[temp1] == arr[temp1-1]){
                        count++;
                        temp1++;
                }
                while(temp2 > left && arr[temp2] == arr[temp2+1]){
                    count++;
                    temp2--;
                } 
                left++;
                right--;
            }else if (sum < target){
                left++;

            }else{
                right--;
            }
            
        }
        return count;
    }

    
    public static void main(String[] args) {
        int[] arr = {1,2, 4, 5, 5, 6,7};
        int target = 9;
        
        System.out.print("NO of Pairs " + countPairs(arr, target));
    }
}
