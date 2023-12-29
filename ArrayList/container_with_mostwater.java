import java.util.ArrayList;

public class container_with_mostwater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        int max = 0;
        //Brute force approach
        // for(int i=0;i<list.size();i++){
        //     for(int j=i;j<list.size();j++){
        //         int min = Math.min(list.get(i),list.get(j));
        //         int curr_max = (j-i)*min;
        //         if(curr_max>max){
        //             max = curr_max;
        //         }
        //     }
        // }

        //2 Pointer approach
        int left_pointer = 0;
        int right_pointer = list.size()-1;
        while(left_pointer<right_pointer){
            int h = Math.min(list.get(left_pointer), list.get(right_pointer));
            int w = right_pointer-left_pointer;
            int area = h*w;
            max = Math.max(max, area);
            if(left_pointer<right_pointer){
                left_pointer++;
            }else{
                right_pointer--;
            }
        }
        System.out.println(max);
    }
}
