import javax.lang.model.element.QualifiedNameable;

public class quicksort {
    public static void quick(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int pivot = ei;
        int x = si-1;
        for(int i=si;i<=ei;i++){
                if(arr[i]<arr[pivot]){
                    x++;
                    int temp = arr[x];
                    arr[x] = arr[i];
                    arr[i] = temp;
                }
        }
        x++;
        int temp = arr[x];
        arr[x] = arr[pivot];
        arr[pivot] = temp;
        quick(arr, si, x-1);
        quick(arr, x+1, ei);
        
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quick(arr, 0, arr.length-1);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
