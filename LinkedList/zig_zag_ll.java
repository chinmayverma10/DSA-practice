public class zig_zag_ll {
    public static class Node {
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
    public void zigzag(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightHead = prev;
        Node leftHead = head;
        Node nextL , nextR;
        while(leftHead != null && rightHead != null){
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            rightHead = nextR;
            leftHead = nextL;
        }
        // if(leftHead != null){
        //     temp.next = leftHead;
        //     temp = temp.next;
        //     leftHead = leftHead.next;
        // }
        
    }
    public static void main(String[] args) {
        zig_zag_ll ll = new zig_zag_ll();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLinkedList(head);
        ll.zigzag(head);
        ll.printLinkedList(head);
    }
} 
