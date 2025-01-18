package PrefixSum;

public class ArrayPuzzel {
    static int[] productExceptSelf(int arr[]){
        int n= arr.length;
        int zeroesCount =0;
        int[] res = new int[n];
        int totalPro =1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroesCount++;
            }else{
                totalPro *=arr[i];
            }
        }
        if(zeroesCount > 1) return res;

        for(int i=0; i<arr.length; i++){
            if(zeroesCount > 0){
                if(arr[i] != 0 ){
                    res[i] = 0;
                }else{
                    res[i] = totalPro;
                }
                
            }else{
                res[i] = totalPro / arr[i];
            }

            
        }
        return res;

        //output - 0 0 0 460800 0 0 0 0 0 0 0

    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,0,5};
        int[] result = productExceptSelf(arr);
        for(int value:result){
            System.out.print(value + " ");
        }
        
       
    }
}
