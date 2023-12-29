import java.util.ArrayList;
import java.util.Collections;
public class array_list{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(8);
        list.add(4);
        System.out.println(list);

        // System.out.println(list.get(1));
        // list.remove(2);
        // System.out.println(list);
        // list.set(0, 0);
        // System.out.println(list);
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(5));
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        //Print reveerse of an arraylist
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }

        //Print max element of an ArrayList
        // int max = list.get(0);
        // for(int i=1;i<list.size();i++){
        //     if(max<list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        //Swap two numbers
        // int idx1 = 1;
        // int idx2 = 3;
        // System.out.println(list);
        // list.set(1, list.get(1)+list.get(3));
        // list.set(3, list.get(1)-list.get(3));
        // list.set(1, list.get(1)-list.get(3));
        // System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}