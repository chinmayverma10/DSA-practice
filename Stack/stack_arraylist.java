import java.util.ArrayList;

public class stack_arraylist {
    static ArrayList<Integer> s = new ArrayList<>();
    public static boolean isEmpty(){
        return s.size() == 0;
    }
    public static void push(int data){
        s.add(data);
    }
    public static int pop(){
        int top = s.get(s.size()-1);
        s.remove(s.size()-1);
        return top;
    }
    public static int peek(){
        return s.get(s.size()-1);
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        while(!isEmpty()){
            System.out.println(peek());
            pop();
        }
    }
}