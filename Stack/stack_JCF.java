import java.util.*;
public class stack_JCF {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(8);
        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk.peek());
      
    }
}
