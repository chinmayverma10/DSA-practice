public class lastoccurence_recursion {
    public static int lastocc(int arr[],int element,int i) {
        if(i < 0 ){
                return -1;
        }
        if(arr[i] == element){
            return i;
        }
        return lastocc(arr, element, i-1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,9,32,4,2,32};
        int ans = lastocc(arr, 4, arr.length-1);
        System.out.println(ans);
    }
}
