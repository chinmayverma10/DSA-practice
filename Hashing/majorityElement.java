import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class majorityElement {
    public static void main(String[] args) {
        // int arr[] = {1,3,2,5,1,3,1,5,1};
        int arr[] = {3,2,3};
        int x = (arr.length)/3;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(tm.containsKey(arr[i]) == true){
                tm.put(arr[i],tm.get(arr[i])+1);
            }else{
                tm.put(arr[i],1);
            }
        }
        System.out.println(tm);
       
        Set<Integer> keys = tm.keySet();
        for (Integer k : keys) {
            if(tm.get(k) <= x){
                continue ;
            }else{
                System.out.print(k+" ");
            }
        }
    }
}
