package Array;
public class linearSearch {
   public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int x = 4;
        int targetIndex = -1;
        for(int i=0; i<arr.length; i++){
           if(arr[i] == x){
            targetIndex = i;
            break;
           }
        }
        System.out.println("x found at "+ targetIndex);
    }
}
