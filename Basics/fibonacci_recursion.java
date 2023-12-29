public class fibonacci_recursion {
    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
        
    }
    public static void main(String[] args) {
        int ans = fibonacci(10);
        System.out.println(ans);
    }
}
