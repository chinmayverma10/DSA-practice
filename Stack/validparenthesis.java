import java.util.Stack;

public class validparenthesis {
    public static boolean valid(String paren){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<paren.length();i++){
            char curr = paren.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                s.push(curr);
            }else {
                if(s.isEmpty()){
                    return false;
                }
                else if((curr == ')' && s.peek() == '(') ||(curr == '}' && s.peek() == '{') || (curr == ']' && s.peek() == '[')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
    public static void main(String[] args) {
        String paren = "({}[])";
        System.out.println(valid(paren));
    }
}
