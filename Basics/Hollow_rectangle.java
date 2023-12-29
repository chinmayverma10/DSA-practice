import java.util.Scanner;

public class Hollow_rectangle {
    public static void print_hollowrectangle(int L,int B) {
        for(int i=1;i<=L;i++){
            for(int j=1;j<=B;j++){
                if(i==1 || i==L || j==1 || j==B){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int Bredth = sc.nextInt();
        print_hollowrectangle(Length, Bredth);

    }
}
