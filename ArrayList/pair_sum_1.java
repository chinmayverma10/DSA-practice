import java.util.ArrayList;

public class pair_sum_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            int sum = list.get(rp) + list.get(lp);
            if(sum==target){
                System.out.println(list.get(lp) + " " + list.get(rp));
                break;
            }else if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }

    }
}
