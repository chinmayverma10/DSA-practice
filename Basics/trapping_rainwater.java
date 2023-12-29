import java.util.*;
public class trapping_rainwater {

    public static int trapped_water(int arr[]) {
        // if(arr.length<=2){
        //     return 0;
        // }
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int curr_bar = i;
            int max_left = 0;
            int max_right = 0;
            for(int j=0;j<=curr_bar;j++){
                if(arr[j]>max_left){
                    max_left = arr[j];
                }
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max_right){
                    max_right = arr[j];
                }
            }
            int water_level = Math.min(max_right, max_right);
            int trapped_water = water_level - arr[i];
            ans=ans+trapped_water;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans = trapped_water(arr);
        System.out.println(ans);
    }
}
