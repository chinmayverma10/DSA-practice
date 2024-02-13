import java.util.Stack;

public class reverseStack {
    public static Stack<Integer> pushAtBottom(Stack<Integer> s,int element){
        if(s.isEmpty()){
            s.push(element);
            return s;
        }
        int top = s.pop();
        pushAtBottom(s, element);
        s.push(top);
        return s;
    }
    public static Stack<Integer> reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return s;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
