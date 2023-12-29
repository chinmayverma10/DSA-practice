public class traverse_linkedlist {
    public class node {
        int data;
        node next ;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public void addfirst(int data) {
        //step 1 --> Create new node
        node newNode = new node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 --> newNode next = head
        newNode.next = head;
        //step 3 --> head = newNode
        head = newNode;
    }
    public void addlast(int data) {
        //Step 1 --> Create new Node
        node new_node = new node(data);
        if(head == null){
            head = tail = new_node;
            return;
        }
        //Step 2 --> tail next = new node
        tail.next = new_node;
        //Step 3 --> tail = new node
        tail = new_node;        
    }
    public void Traverse_ll() {
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
     traverse_linkedlist ll = new traverse_linkedlist();   
     ll.addfirst(2);
     ll.addfirst(1);
     ll.addlast(3);
     ll.addlast(4);
     ll.Traverse_ll();
    }
}
