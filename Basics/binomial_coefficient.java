import java.util.Scanner;

public class binomial_coefficient {
    public static int binomialcoefficient(int n,int r) {
        int z = n-r;
        int nfact = 1;
        int rfact = 1;
        int zfact = 1;
        for(int i=1;i<=n;i++){
            nfact = nfact*i;
        }
        for(int i=1;i<=r;i++){
            rfact = rfact*i;
        }
        for(int i=1;i<=z;i++){
            zfact = zfact*i;
        }
        int ans = (nfact/(rfact*zfact));
        return ans;
        
    }
    public static void main(String[] args) {
        //Binomial Coefficient
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = binomialcoefficient(n, r);
        System.out.println(ans);


    }
}
