public class xtopowern_recursion {
    public static int xtopowern(int x,int n) {
        if(n == 0){
            return 1;
        }   
        return x * xtopowern(x, n-1);
    }

    //OPTIMIZED_SOLUTION
    public static int xton(int x,int n) {
        if(n == 1){
            return x;
        }

        int z = xton(x, n/2);
        if(n%2 != 0){
            return z*z* x;
        }
        return z*z;
        
    }
    public static void main(String[] args) {
        int ans = xton(2, 11);
        System.out.println(ans);
    }
}
