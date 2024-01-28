import java.util.*;
public class stack_arrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack newStack = new Stack();
        newStack.push(2);
        newStack.push(4);
        newStack.push(8);
        System.out.println(newStack.peek());
        newStack.pop();
        newStack.pop();
        System.out.println(newStack.peek());
    }
}