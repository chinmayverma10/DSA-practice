public class xtopowern {
    public static int powern(int x,int n){
        if(n == 0){
            return 1;
        }
        return x*powern(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(powern(2, 10));
    }
}
