public class findoccurence {
    public static void occurence(int arr[],int key,int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.println(idx);
        }
        occurence(arr, key, ++idx);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        occurence(arr, 2, 0);
    }
}
