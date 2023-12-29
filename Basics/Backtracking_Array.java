public class Backtracking_Array {
    public static void update(int arr[],int index,int start) {
        if(index == arr.length){
            // index--;
            return;
        }
        arr[index] = start;
        // index++;
        // start++;
        update(arr, index+1, start+1);
        arr[index] -= 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        update(arr, 0, 1);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
