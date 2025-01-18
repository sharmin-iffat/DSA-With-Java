package Array;
public class deepCopy {
    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {5,6,7,3,8,9};
        System.out.print("Original Array : ");
        printArray(arr);

        int [] arr_2 = arr.clone();
        System.out.print("Copied Array : ");
        printArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.print("Original array after changing arr_2 : ");
        printArray(arr);
        System.out.print("Copied array after changing arr_2 : ");
        printArray(arr_2);
        
    }
    
}
