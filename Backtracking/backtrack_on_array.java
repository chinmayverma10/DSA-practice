public class backtrack_on_array {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void array(int arr[],int idx){
        if(idx == arr.length){
            return;
        }
        arr[idx] = idx+1;
        array(arr, idx+1);
        arr[idx] -= 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        array(arr, 0);
        printarr(arr);
    }
}
