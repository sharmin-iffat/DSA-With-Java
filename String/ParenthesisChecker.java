package String;

public class ParenthesisChecker {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        //This solution is not correct 
        int i=0;
        int j= s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
              return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(s);
        System.out.println("The condition is : "+ isParenthesisBalanced(s));
        
    }
}
