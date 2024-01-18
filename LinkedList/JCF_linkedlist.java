import java.util.LinkedList;
public class JCF_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);

        //remove
        System.out.println(ll);
        // ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.get(0));;
    }
}
