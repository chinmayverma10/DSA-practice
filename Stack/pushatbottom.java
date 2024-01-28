import java.util.*;
public class pushatbottom {
    public static void addBottom(int data,Stack<Integer> stk){
        if(stk.peek() == null){
            stk.push(data);
            return;
        }
        int top = stk.peek();
        stk.pop();
        addBottom(data, stk);
        stk.push(top);
        
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

    }
}
