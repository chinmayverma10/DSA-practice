import java.util.Stack;

public class duplicate_parenthesis {
    public static boolean checkduplicate(String exp){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char curr = exp.charAt(i);
            if(curr != ')' ){
                s.push(curr);
            }else {
                if(s.peek() != '('){
                    while(s.peek() != '('){
                        s.pop();
                    }
                    s.pop();
                }else if(s.peek() == '('){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String exp = "(((a+(b)))+(c+d)) ";
        System.out.println(checkduplicate(exp));
    }
}
