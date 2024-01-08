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
    public void addMid(int idx,int data){
        if(idx == 0){
            addFirst(data);
        }
        int curridx = 0;
        Node temp = head;
        while(curridx<idx-1){
            temp = temp.next;
            curridx++;
        }
        Node newNode = new Node(data);                     // 1-->2-->4
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        Linked_list ll = new Linked_list(); 
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        printLinkedList(head);
        ll.addMid(1, 2);
        printLinkedList(head);
        ll.addMid(3, 8);
        printLinkedList(head);
    }
}