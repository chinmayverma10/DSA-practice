import java.util.*;
public class maxhistogramarea {
    public static int maxarea(int[] arr){
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        int count = 1;
        int maxarea = arr[0];
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            if(curr<s.peek()){
                if((curr*count+1)>=maxarea){
                    s.push(curr);
                    count++;
                    maxarea = curr*count+1;
                }else{
                    if(!s.isEmpty()){

                        s.pop(); 
                    }
                }
            }else if(curr == s.peek()){
                count++;
                s.push(curr);
                maxarea = curr*count;
            }else if(curr>s.peek()){
                if(maxarea<curr){
                    while(!s.isEmpty()){
                        s.pop();
                        count--;
                    }
                    s.push(curr);
                    count++;
                    maxarea = curr;
                }else{
                    s.push(curr);
                    count++;
                    maxarea += s.peek();
                }
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(maxarea(arr));

    }
}
