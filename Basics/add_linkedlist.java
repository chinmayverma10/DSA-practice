public class add_linkedlist {
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
    public static int size = 1;
    public void addfirst(int data) {
        //step 1 --> Create new node
        node newNode = new node(data);
        size++;
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
        size++;    
        if(head == null){
            head = tail = new_node;
            return;
        }
        //Step 2 --> tail next = new node
        tail.next = new_node;
        //Step 3 --> tail = new node
        tail = new_node;    
    }
    public void addmid(int idx,int data) {
        node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
            if(temp == null){
                System.out.println("Index not present ");
                return;
            }
        }
        node newNode = new node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int size() {
        int ans = 0;
        node temp = head;
        while(temp != null){
            ans++;
            temp= temp.next;
        }
        return ans;
    }
    public static void main(String[] args) {
     add_linkedlist ll = new add_linkedlist();   
     ll.addfirst(2);
     ll.addfirst(1);
     ll.addlast(4); 
     ll.addlast(5);
     ll.addlast(6);
     ll.addlast(7);
    //  ll.addmid(4,3);
    //  System.out.println(size);
    int ans = ll.size();
    System.out.println(ans);
    }
}
