import java.util.Scanner;

public class palindrome {
    public static boolean is_palindrome(int n) {
        int temp=0;
        int num =n;
        while(n>0){
            int r = n%10;
            temp = (temp*10)+r;
            n=n/10;
        }
        if(num==temp){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = is_palindrome(n);
        System.out.println(ans);

    }
}
