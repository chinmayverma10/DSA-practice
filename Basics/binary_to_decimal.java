import java.util.Scanner;

public class binary_to_decimal {
    public static int bin_to_dec(int n) {
        int pow = 0;
        int dec = 0;
        while(n>0){
            int last_digit = n%10;
            dec = dec + (last_digit*(int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        return dec;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = bin_to_dec(N);
        System.out.println(ans);
    }
}
