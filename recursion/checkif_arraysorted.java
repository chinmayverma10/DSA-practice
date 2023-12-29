public class checkif_arraysorted {
    public static boolean check(int arr[],int n){
        if(n == 0){
            return true;
        }
        if(arr[n]<arr[n-1]){
            return false;
        }
        return check(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5  };
        System.out.println(check(arr, arr.length-1));
    }
}
