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
    public static int size;

    public void addFirst(int data){
        //Create a node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }


        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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
        Node newNode = new Node(data);                     // 1-->2-->4-->null
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public static void removeFirst(){
        if(head == null){
            System.out.println("No linked list exist");
            return;
        }else if(head.next == null){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }
    public static void removeLast(){
        if(head == null){
            System.out.println("No linked list");
            return;
        }else if(head.next == null){
            head = tail = null;
        }
        Node prev = head;
        int i =0;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        prev.next = null;
        tail = prev;
        size--;
    }

    public int findValue(int val){
        if(head == null){
            System.out.println("Linked List does not exist");
            return -1;
        }
        int idx = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return idx;
            }
            else{
                temp = temp.next;
                idx++;
            }
        }
        return -1;
    }
    public static int findValueRecursive(int val,Node temp,int idx){
        if(temp == null){
            System.out.println("Value doesnt exist ");
            return -1;
        }
        if(temp.data == val){
            return idx;
        }
        return findValueRecursive(val, temp.next, idx+1);
    }
    public void reverseLL(){
        if(head == null){
            System.out.println("LinkedList does not exist ");
            return;
        }else if(head.next == null){
            return;
        }
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
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
        System.out.println(size);
        removeFirst();
        printLinkedList(head);
        removeLast();
        printLinkedList(head);
        removeLast();
        printLinkedList(head);
        System.out.println("c");
        // System.out.println(ll.findValue(2));
        // System.out.println(ll.findValue(3));
        // System.out.println(ll.findValue(8));
        // System.out.println(ll.findValue(10));
        // System.out.println(findValueRecursive(2, head, 0));
        // System.out.println(findValueRecursive(3, head, 0));
        // System.out.println(findValueRecursive(8, head, 0));
        // System.out.println(findValueRecursive(10, head, 0));
        ll.reverseLL();
        printLinkedList(head);
    }
}