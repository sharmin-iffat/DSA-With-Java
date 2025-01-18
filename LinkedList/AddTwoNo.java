package LinkedList;
//Not solved
public class AddTwoNo {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static void addTwoNumber(Node h1 , Node h2){
         Node ans = new Node(100);
        Node t = h1;
        Node w = h2;
        int carry =0;
        
        while(t != null && w != null){
            int sum = carry;
            sum = t.val + w.val;
            if(sum > 10){
                carry = sum % 10;

            }

        }
    }
    // static int Add(int num){
    //     return num;
    // }
    static int convertArrayToInteger(int[] arr){
        int res =0;
        for(int i=0; i<arr.length; i++){
            res= res*10 + arr[i];
        }
        return res;
    }
    static int reverseInteger(int num){
        int revNum = 0;
        while(num !=0){
            int digit = num % 10;
            revNum = revNum *10 + digit;
            revNum/=10;

        }
        return revNum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);

        Node A = new Node(5);
        Node B = new Node(6);
        Node C = new Node(8);

        a.next = b;
        b.next = c;
        A.next = B;
        B.next = C;
        int res = convertArrayToInteger(arr);
        // System.out.println(res);
        int ans = reverseInteger(12345);
        System.out.println(ans);
    
    }
    
}
