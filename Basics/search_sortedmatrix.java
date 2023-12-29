public class search_sortedmatrix {
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        int row = 0 , colum = arr[0].length-1;
        while(row < arr.length && colum >= 0){
            if(key == arr[row][colum]){
                System.out.println(row+" "+colum);
                break;
            }
            else if(key<arr[row][colum]){   
                colum--;
            }
            else{
                row++;
            }
        }
    }
}
