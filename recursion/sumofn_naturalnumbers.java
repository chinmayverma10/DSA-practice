public class sumofn_naturalnumbers {
    public static int sumnatural(int n){
        if(n == 1){
            return 1;
        }
        return n + sumnatural(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumnatural(10));
    }
}
