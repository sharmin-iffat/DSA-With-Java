package Stack;

import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        System.out.println("Is stack empty : " + st.isEmpty());
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);
        System.out.println("Size of the stack " + st.size());
        System.out.println("Deleting the last element " + st.pop());
        System.out.println("Last element " + st.peek());
        System.out.println("Size of the stack " + st.size());
        System.out.println("Is stack empty : " + st.isEmpty());
    }
}
