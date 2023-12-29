public class Diagonalsum_2Darray {
    public static int diagonalsum(int arr[][]) {
        // int n = arr.length;
        // int prim_sum = 0 , second_sum = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i == j){
        //             prim_sum += arr[i][j];
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i+j == n-1){
        //             second_sum += arr[i][j];
        //         }
        //     }
        // }

        // System.out.println(prim_sum);
        // System.out.println(second_sum);

        //FOR LINEAR TIME COMPLEXITY
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i][i];
            if(i != arr.length-i-1){
                sum += arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] =  {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int ans = diagonalsum(arr);
        System.out.println(ans);
    }
}
