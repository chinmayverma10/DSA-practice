public class searchinsortedrotatedarray {
    public static int search(int arr[],int si,int ei,int target) {
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(target==arr[mid]){
            return mid;
        }
        //LINE1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, si, mid, target);
            } else{
                return search(arr, mid+1, ei, target);
            }
        }
        //LINE2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, mid+1, ei, target);
            } else{
                return search(arr, si, mid, target);
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = {4,5,6,7,0,1,2};
         int ans = search(arr, 0,arr.length-1, 2);
         System.out.println(ans);
    }
}
