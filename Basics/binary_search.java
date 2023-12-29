import java.util.*;
public class binary_search {
    public static int binarysearch(int arr[],int n,int num) {
        int first = 0;
        int last = n-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(num>arr[mid]){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int n = arr.length;
        int num = 7;
        int ans = binarysearch(arr, n, num);
        System.out.println(ans);
    }
}
