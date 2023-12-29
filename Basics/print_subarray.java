import java.util.*;
public class print_subarray {
    public static void subarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.print(" = "+sum);
                if(max<sum){
                    max = sum;
                }
                System.out.println();
                System.out.print(" ");
            }
            System.out.println();
        }
        int total = (arr.length*(arr.length+1))/2;
        System.out.println(total+" elements");
        System.out.println(max);
    }
    public static void prefix_sum(int arr[]){
        int prefix_array[] = new int[arr.length] ;
        prefix_array[0] = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            prefix_array[i] = prefix_array[i-1] + arr[i]; 
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;

                int sum = start == 0 ? prefix_array[end] : prefix_array[end] - prefix_array[start-1];
                if(max<sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
    public static void kadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        kadanes(arr);
    }
}

