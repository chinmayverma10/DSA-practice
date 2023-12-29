import java.util.Scanner;

public class func_with_parameters {
    public static int sum(int A , int B) {
        int c = A+B;
        return c;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = sum(A,B);
        System.out.println(ans);
    }
}
