import java.util.*;
import java.lang.Math;
public class optimized_isprime {
    public static Boolean prime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ans = prime(N);
        System.out.println(ans);
    }
}
