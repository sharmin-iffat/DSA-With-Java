package Array;
public class maxValueOutOfAllElement {
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,9,12,65,22,45};
        int max = 0;
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
                index = i;
            }
        }
        System.out.print("Maximum value of the given array is "+ max + " at " + index);
    }
}
