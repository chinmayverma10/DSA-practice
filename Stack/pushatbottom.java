import java.util.*;
public class pushatbottom {
    public static void pushAtBottom(Stack<Integer> s,int element){
        if(s.isEmpty()){
            s.push(element);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, element);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s, 10);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
