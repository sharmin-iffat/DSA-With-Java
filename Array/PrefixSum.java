package Array;

public class PrefixSum {
    static int [] prefixSum(int [] arr){
       
        int [] pref= new int[arr.length];
        pref[0]=arr[0];
        for(int i=1; i<arr.length; i++){
             
            pref[i] = pref[i-1] + arr[i];

        }
        return pref;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int [] pref = prefixSum(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(pref[i] + " ");
        }
       
    }
}
