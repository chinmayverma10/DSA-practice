public class friendspairingproblme_recursion {
    public static int friendpairing(int n) {
        if(n == 1 || n == 2 ){
            return n;
        }
        return friendpairing(n-1) + (n-1)*friendpairing(n-2);
        
    }
    public static void main(String[] args) {
        int ans = friendpairing(3);
        System.out.println(ans);
    }
}
