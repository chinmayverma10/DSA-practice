public class check_sortedarray_recursion {
    public static boolean cheackarr(int arr[],int i) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return cheackarr(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,5};
        boolean ans = cheackarr(arr, 0);
        System.out.println(ans);
    }
}
