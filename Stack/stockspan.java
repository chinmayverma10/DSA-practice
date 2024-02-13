import java.util.*;
public class stockspan {
    public static int[] ss(int arr[]){
        int span[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            while(arr[s.peek()]<curr && !s.isEmpty()){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i;
            }else{
                span[i] = i - s.peek();
            }
            s.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,85,100};
        int span[] = ss(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
