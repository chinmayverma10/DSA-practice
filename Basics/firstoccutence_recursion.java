public class firstoccutence_recursion {
    public static int firstocc(int arr[],int element,int i) {
        if(i == arr.length){
                return -1;
            
            
        }
        if(arr[i] == element){
            return i;
        }
        return firstocc(arr, element, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,10,5,9,32,4,2};
        int ans = firstocc(arr, 32, 0);
        System.out.println(ans);
    }
}
