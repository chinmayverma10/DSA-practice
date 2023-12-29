import java.util.*;
public class reverse_an_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        if(arr.length%2 == 0 ){
            mid = mid + (arr.length/2);
        }
        else{
            mid = mid + arr.length/2;
        }
        for(int i=0;i<mid;i++){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
