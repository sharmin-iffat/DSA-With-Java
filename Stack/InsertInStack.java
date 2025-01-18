package Stack;

import java.util.Stack;

public class InsertInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);

        //Insert At Bottom
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());
        }
        st.push(12);
        while(gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println("After Insertion at bottom" + st);

        //Insert at any index
        int idx =3;
        int x= 15;
        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println("After Insertion at bottom" + st);
    }
    
}
