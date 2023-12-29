public class searchin_sorted_rotated_array {
    public static int search(int arr[],int target,int si,int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(target == arr[mid]){
            return mid;
        }

        //case when mid is on line 1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[ei]){
                return search(arr, target, si, mid-1);
            }
            else{
                return search(arr, target, mid+1, ei);
            }
        } // case 2 when mid is on line 2
        else{
            if(arr[mid]<=target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};    
        int tar =  6;             // --> Answer : 4
        System.out.println(search(arr, tar, 0, arr.length-1));
    }
}
