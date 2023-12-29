public class tillingproblem_recursion {
    public static int tile(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return tile(n-1) + tile(n-2);
    }
    public static void main(String[] args) {
        int ans = tile(4);
        System.out.println(ans);
    }
}
