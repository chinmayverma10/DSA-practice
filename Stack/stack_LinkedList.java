public class stack_LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int size = 0;
    public static Node head;
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        return top;
    }
    public static void main(String[] args) {
        stack_LinkedList list = new stack_LinkedList();
        list.push(2);
        list.push(4);
        list.push(8);
        System.out.println(list.peek());
        list.pop();
        list.pop();
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
    }
}
