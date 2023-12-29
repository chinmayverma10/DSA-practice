import java.util.ArrayList;

public class multidimensional_arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main_list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        main_list.add(list1);
        main_list.add(list2);
        main_list.add(list3);
        System.out.println(main_list);
    }
}
