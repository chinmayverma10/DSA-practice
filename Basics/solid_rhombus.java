import java.util.Scanner;

public class solid_rhombus {
    public static void print_rhombus(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("  ");
            }
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_rhombus(n);
    }
}
