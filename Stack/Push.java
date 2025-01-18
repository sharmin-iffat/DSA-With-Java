package Stack;

import java.util.Stack;

public class Push {
    //Push At Bottom Using Recursion
    static void pushAtBottom(Stack<Integer> st ,int x){
        if(st.size() == 0){
            st.push(x);
            return;
        } 
        int top = st.pop();
        pushAtBottom(st,x);
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
        pushAtBottom(st,16);
        System.out.println(st);
    }
    
}
