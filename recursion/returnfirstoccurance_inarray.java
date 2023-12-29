public class returnfirstoccurance_inarray {
    public static int index(int arr[],int idx,int key){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == key){
            return idx;
        }
        return index(arr, ++idx, key);
    }
    public static void main(String[] args) {
        int arr[] = {20,55,80,90,60};
        System.out.println(index(arr, 0, 88 ));
    }
}
