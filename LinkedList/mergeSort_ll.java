public class mergeSort_ll {
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
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft , newRight);
    }
    private static Node merge(Node leftHead,Node rightHead){
         Node mergedll = new Node(Integer.MIN_VALUE);
         Node temp = mergedll;
         while(leftHead != null && rightHead != null){
            if(leftHead.data <= rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            }else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
         }
         while(leftHead != null){
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
         }
         while(rightHead != null){
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
         }

         return mergedll.next;
    }
    public static void main(String[] args) {
        mergeSort_ll ll = new mergeSort_ll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLinkedList(head);
        head = ll.mergeSort(head);
        ll.printLinkedList(head);
    }
}
