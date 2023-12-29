import java.util.Scanner;

public class inverted_rotated_halfpyramid {
    public static void HalfPyramid(int n) {
        for(int i=1;i<=n;i++){
            //forspaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //forstars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HalfPyramid(n);
    }
}
