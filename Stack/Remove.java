package Stack;

import java.util.Stack;

public class Remove {
    // Using recursion
    static void removeFromBottom(Stack<Integer> st){
        if(st.size() == 1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeFromBottom(st);
        st.push(top);
    }
    static void removeFromAnyIndex(Stack<Integer> st , int idx){
        if(st.size() == idx +1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeFromAnyIndex(st , idx);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);
        // removeFromBottom(st);
        // System.out.println(st);
        removeFromAnyIndex(st, 2);
        System.out.println(st);
    }
    
}
