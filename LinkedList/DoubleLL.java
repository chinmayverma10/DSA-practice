public class DoubleLL{
    public static class Node {
        Node prev;
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        return;
    }
    public static void printll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }
    public static void removeFirst(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        head.next.prev = null;
        head = head.next;
        size--;
        return;
    }
    public static void removeLast(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
        size--;
        return;
    }
    public static void reverse(){
        if(head.next == null){
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        // ll.removeFirst();
        // ll.removeLast();
        ll.reverse();
        System.out.println(size);
        ll.printll();
        System.out.println("hello");
    }
}