import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String name = "Chinmay";
        for(int i=0;i<name.length();i++){
            st.push(name.charAt(i));
        } 
        while(st.peek() != null){
            System.out.println(st.pop());
        }
    }
}
