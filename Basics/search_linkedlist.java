public class search_linkedlist {
    public class node {
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size ;
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
    //Remove operation in linkedlist
    //Remove at first
    public void removefirst(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }else if(size == 1){
            head = tail = null;
            return;
        }
        head = head.next;
        size--;
    }
    public void removelast(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }else if(size == 1){
            head = tail = null;
            return;
        }
        node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
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
    public void search(int key){
        if(size == 0){
            System.out.println("ll is empty");
            return;
        }else if(size == 1){
            System.out.println("ll is present at position 1");
            return;
        }
        int idx=1;
        node temp = head;
        while(temp != null){
            if(temp.data == key){
                System.out.println("ll is present at position "+idx);
                return;
            }else{
                temp = temp.next;
                idx++;
            }
        }
        System.out.println(-1);
    } 
    public static void main(String[] args) {
        search_linkedlist ll = new search_linkedlist();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3); 
        ll.addlast(4);
        ll.Traverse_ll();
        System.out.println();
        ll.search(4);
    }
}
