import java.util.*;
public class shortestpath_string {
    public static float shortestpath(String s) {
        int arr[] = new int[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'N'){
                arr[0] += 1;
            }
            else if(s.charAt(i) == 'S'){
                arr[0] -= 1;
            }
            else if(s.charAt(i) == 'E'){
                arr[1] += 1;
            }
            else if(s.charAt(i) == 'W'){
                arr[1] -= 1;
            }
        }
        int ans = arr[0]*arr[0] + arr[1]*arr[1];
        return (float)Math.sqrt(ans);
    }
    public static void main(String[] args) {
        String s = "NSEW";
        float z = shortestpath(s);
        System.out.println(z);
    }
}
