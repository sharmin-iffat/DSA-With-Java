package String;

public class ReverseSentence {
    
    public static void main(String[] args) {
        String str = "   I  am      a   Software  Developer  ";
        String ans = "";
        StringBuilder s = new StringBuilder("");
        for(int i=str.length()-1; i>=0; i--){
        char ch = str.charAt(i);
        if(ch != ' '){
        s.append(ch);
        }else{
        s.reverse();
        ans+=s;
        ans+=" ";
        s= new StringBuilder("");
        }
        }
        s.reverse();
        ans+=s;
        System.out.print(ans);
    }
}
