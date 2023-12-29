public class selection_sort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_pos = i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[min_pos]>arr[j]){
                    min_pos = j;
                }
            }
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
    }
}
