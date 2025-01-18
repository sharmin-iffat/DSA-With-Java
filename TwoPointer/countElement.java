// import java.lang.reflect.Array;
import java.util.ArrayList;


//This solution is wrong, you need to solve by using hashmap

//So first you need to learn hashmap then solve this question

public class countElement {
    static ArrayList<Integer> countDistinctElementInEveryWindow(int[] arr, int k){
        // ArrayList<Integer> window = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length-k; i++){
            int count = k;
            for(int j=i+1; j<=k; j++){
                if(arr[i] == arr[j]){
                    count--;
                }
            }
            ans.add(count);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;
        System.out.println(countDistinctElementInEveryWindow(arr, k));
    }
}
