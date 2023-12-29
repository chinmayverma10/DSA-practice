import java.util.*;
public class bubble_sort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int swap = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap == 0){
                System.out.println("Already sorted ");
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        bubbleSort(arr);
    }
}
