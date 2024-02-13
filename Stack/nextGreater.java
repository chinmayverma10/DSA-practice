import java.util.*;
public class nextGreater {
    public static void findnextG(int arr[],int nextG[]){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1 ; i>=0 ; i--){
            int curr = arr[i];
            while(!s.isEmpty() && arr[s.peek()] <= curr){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i] = -1;
            }else{
                nextG[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextG[] = new int[arr.length];
        findnextG(arr, nextG);
        for(int i=0;i<arr.length;i++){
            System.out.print(nextG[i]+" ");
        }

    }
}
