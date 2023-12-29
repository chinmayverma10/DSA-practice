public class Linked_list {
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //Create a node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void printLinkedList(Node node){
        if(node == null){
            System.out.println("Null");
            return;
        }
        System.out.print(node.data+"--> ");
        printLinkedList(node.next);
    }
    public static void main(String[] args) {
        Linked_list ll = new Linked_list(); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        printLinkedList(head);
        ll.addLast(5);
        ll.addLast(6);
        printLinkedList(head);
    }
}