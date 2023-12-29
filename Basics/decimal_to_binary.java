import java.util.*;
public class decimal_to_binary {
    public static int DecNum(int n) {
        int bin_num = 0;
        int pow = 1;
        while(n>0){
            bin_num = bin_num + ((n%2)*pow);
            pow = pow * 10;
            n = n/2;
        }
        return bin_num;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = DecNum(N);
        System.out.println(ans);
    }   
}
