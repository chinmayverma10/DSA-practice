import java.util.Stack;

public class reverseString {
    public static StringBuilder reverse(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder rtn = new StringBuilder();
        for(int i=0;i<s.length();i++){
            rtn.append(st.pop());
        } 
        return rtn;
    }
    public static void main(String[] args) {
        String s = "chinmay";
        System.out.println(reverse(s));
    }
}
