import java.util.Scanner;

public class check_primenum {
    public static Boolean prime(int n) {
        int a = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ans = prime(N);
        System.out.println(ans);
    }
}
