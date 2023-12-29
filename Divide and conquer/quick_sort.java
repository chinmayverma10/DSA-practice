public class quick_sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivot = arr[ei];
        int i = si-1; //iterator
        for(int j=si;j<=ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        quicksort(arr, si, i-1);
        quicksort(arr, i+1, ei);
    }
    public static void main(String[] args) {
        int arr[] = {1 ,4 ,2 ,9 ,5 ,7 ,3 ,4 ,10 ,2};
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
